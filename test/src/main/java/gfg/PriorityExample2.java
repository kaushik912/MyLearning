package gfg;

import java.util.PriorityQueue;

public class PriorityExample2 {
	public static void main(String[] args) {
		int[] arr = new int[]{4,2,7,6,9};
		PriorityQueue<Integer> p = new PriorityQueue<>();
		//In java, PriorityQueue is a min heap by default
		for(int num:arr) {
			p.offer(num);
		}
		int cost=0;
		while(!p.isEmpty()) {
			int num1 = p.poll();
			if(!p.isEmpty()) {
				int num2 = p.poll();
				int sum = num1+num2;
				cost+=sum;
				p.offer(sum);	
			}
			
		}
		System.out.println(cost);
	}
}
