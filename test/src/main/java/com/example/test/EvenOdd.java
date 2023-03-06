package com.example.test;

public class EvenOdd {
	
	public static void main(String[] args) {
		Thread even = new Thread(new PrintWorker(0,100));
		Thread odd = new Thread( new PrintWorker(1,100));
		even.start();
		odd.start();
		
	}
	
	static class PrintWorker implements Runnable{
		int i;
		static int count=0;
		int max;
		static Object lock = new Object();
		PrintWorker(int i, int max){
			this.i=i;
			this.max=max;
		}
		@Override
		public void run() {
			synchronized(lock) {
				
				while( count<max) {
					
					if((count%2==0 && i==1) || (count%2!=0 && i==0)) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					
					
					System.out.println("T"+i+": "+count);
					count++;
					lock.notifyAll();
				}
				
				
			}
			
		}
		
	} 

}
