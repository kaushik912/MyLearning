package com.example.test;

import java.util.LinkedList;
import java.util.List;

public class Singleton2 {
	
	private static int count=0;
	
	private Singleton2() {
		
	}
	
	private static Singleton2 instance;
	private static Object lock = new Object();
	
	public static Singleton2 getSingleton() {
		if(instance==null) {
			synchronized(lock) {
				if(instance==null) {
					instance = new Singleton2();
					count++;
				}
			}
			
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<1000;i++ ) {
			int result = runExperiment();
			if(result>1) {
				System.out.println(result);
				break;
			}
		}
		
		System.out.println("final count: "+ count);
	}
	
	private static int runExperiment() {
		instance=null;
		count=0;
		
		Runnable r = () -> {
			getSingleton();
		};
		
		List<Thread> threads = new LinkedList<>();
		for(int i=0;i<5;i++) {
			Thread t = new Thread(r);
			threads.add(t);
		}
		
		threads.forEach(t -> t.start());
		
		return count;
	}

}
