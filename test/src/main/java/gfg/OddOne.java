package gfg;

public class OddOne {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		Node right= new Node(2);
		Node left = new Node(3);
		root.right=right;
		root.left = left;
		OddOne one = new OddOne();
		boolean isPresent = one.check(root,5);
		System.out.println(isPresent);
		
		Node root1 = new Node(1);
		Node child1 = new Node(3);
		Node child2 = new Node(2);
		Node child3 = new Node(4);
		root1.left=child1;
		child1.left=child2;
		child1.right=child3;
		
		one.oddNodeOut(root, root1);
		
		System.out.println(one.sumNodes(root1));
		
	}

	static Node oddOne=null;
    int oddNodeOut(Node root1, Node root2){
	     preOrder(root1,root2);
	     int result = oddOne.data;
	     oddOne=null;
	     return result;
    }
	    
	    void preOrder(Node root1, Node root2){
	        if(root2!=null && oddOne==null){
	            boolean isPresent = check(root1,root2.data);
	            if(!isPresent){
	                oddOne=root2;
	            }else{
	             preOrder(root1,root2.left);  
	             preOrder(root1,root2.right);
	            }
	        }
	    }
	    
	    boolean check(Node root, int val){
	        if(root==null){
	            return false;
	        }
	        if(root.data==val){
	            return true;
	        }else{
	            return check(root.left,val) || check(root.right,val);
	        }
	    }
	    
	    int sumNodes(Node root){
	        
	        if(root!=null){
	             return root.data+sumNodes(root.left)+ sumNodes(root.right);
	        }
	        
	        return 0;
	     
	    }
}

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
