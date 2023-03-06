package com.example.test;

import java.util.LinkedList;
import java.util.List;

public class Singleton {
	
	private static int count=0;
	
	private Singleton() {
		
	}
	
	private static Singleton instance;
	
	public static Singleton getSingleton() {
		if(instance==null) {		
			instance = new Singleton();
			count++;
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++ ) {
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
