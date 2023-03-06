package iqa;

import java.util.Arrays;
import java.util.List;

public class LinkedListReverse {

	public static void printNormal(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public static void printReverse(Node head) {
		if(head.next!=null) {
			 printReverse(head.next);
		}
		//Tail node
		System.out.println(head.data);
		
	}
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,3,4,5);
		Node head = new Node(1);
		int count=0;
		Node curr = head;
		while(count<nums.size()) {
			Node newNode = new Node(nums.get(count));
			count++;
			curr.next = newNode;
			curr = curr.next;
		}
		
		printNormal(head);
		printReverse(head);
	}
	
}

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
}
