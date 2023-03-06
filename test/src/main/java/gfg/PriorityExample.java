package gfg;

import java.util.PriorityQueue;

public class PriorityExample {
	public static void main(String[] args) {
		int[] arr = new int[]{4,2,7,6,9};
		
		PriorityQueue<Integer> p = new PriorityQueue<>((a,b)-> b.compareTo(a));
		//Example of PriorityQueue as a max heap
		for(int num:arr) {
			p.offer(num); //offer method to insert into a heap
		}
		int k=3;
		for(int i=0;i<k;i++) {
			System.out.println(p.poll()); //poll to extract value from a heap
		}
	}
}
