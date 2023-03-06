package gfg;

import java.util.ArrayList;
import java.util.Stack;

public class ZigZag {

	static ArrayList<Integer> zigZagTraversal(Node root) {
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		int level = 0;
		ArrayList<Integer> result = new ArrayList<>();

		while (!s1.isEmpty() || !s2.isEmpty()) {
			Node curr = s1.pop();
			result.add(curr.data);
			boolean wasS1Empty = s1.isEmpty();
			if (level % 2 == 0) {
				// l,r
				if (curr.left != null) {
					if (!wasS1Empty) {
						s2.push(curr.left);
					} else {
						s1.push(curr.left);
					}
				}

				if (curr.right != null) {
					if (!wasS1Empty) {
						s2.push(curr.right);
					} else {
						s1.push(curr.right);
					}
				}
			} else {

				if (curr.right != null) {
					if (!wasS1Empty) {
						s2.push(curr.right);
					} else {
						s1.push(curr.right);
					}
				}

				if (curr.left != null) {
					if (!wasS1Empty) {
						s2.push(curr.left);
					} else {
						s1.push(curr.left);
					}
				}
			}

			if (wasS1Empty) {
				level++;
			}

			if (s1.isEmpty() && !s2.isEmpty()) {
				Stack<Node> temp = s1;
				s1 = s2;
				s2 = temp;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		Node root = new Node(3);
		Node child1 = new Node(2);
		Node child2 = new Node(1);
		root.left = child1;
		root.right = child2;
		ArrayList<Integer> zigZagTraversal = zigZagTraversal(root);
		System.out.println(zigZagTraversal);

	}
	
	static class Node {
		int data;
		Node left, right;

		Node(int d) {
			data = d;
			left = right = null;
		}
	}

}


