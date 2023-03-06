package com.example.test;

import java.util.concurrent.CountDownLatch;

public class ThreadEndless{
	
	public static void main(String[] args) throws InterruptedException {
		ThreadEndless te = new ThreadEndless();
		int sum=0;
		int N=99; //N should be multiple of 3
		CountDownLatch latch = new CountDownLatch(N);
		
		while(sum<N) {
			Thread[] threads = new Thread[3];
			int count=0;
			for(Thread t : threads) {
				t = new Thread( new PrintWorker(count,latch));
				t.start();
				count++;
			}
			sum=sum+threads.length;
		}
		
		latch.await();
		
	}
	
	
	static class PrintWorker implements Runnable{
		int i;
		private static int count=0;
		private static Object lock =new Object();
		private CountDownLatch latch;
		
		public PrintWorker(int i, CountDownLatch latch) {
			this.i=i;
			this.latch=latch;
		}
		
		@Override
		public void run() {
			synchronized(lock) {
				
				while((count%3)!=i) {
					try {
						//System.out.println("waiting thread:"+ i + ",current count="+ count);
						lock.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				System.out.println(i);
				latch.countDown();
				count++;
				//System.out.println("remaining: "+latch.getCount());
				
				lock.notifyAll();
			}
			
			
		}
		
	}
}
