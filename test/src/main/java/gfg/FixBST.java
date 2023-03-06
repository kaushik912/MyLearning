package gfg;

import java.util.ArrayList;
import java.util.List;

public class FixBST {
	
	 //Function to fix a given BST where two nodes are swapped.  
    static public Node correctBST(Node root)
    {
        List<Node> prev = new ArrayList<>();
        List<Node> result = new ArrayList<>();
        inOrder(root,prev,result);
        if(result.size()==2){
            Node val1 = result.get(0);
            Node val2 = result.get(1);
            int temp = val1.data;
            val1.data = val2.data;
            val2.data=temp;
        }
        return root;
    }
    
    static void inOrder(Node root, List<Node> prev, List<Node> result){
        if(root==null){
            return;
        }
        
        if(root.left!=null){
            inOrder(root.left,prev,result);
        }
        
        if(prev.size()==0){
            prev.add(root);
            
        }else{
            int lastVal = prev.get(0).data;
            int currentVal = root.data;
            if(currentVal < lastVal){
                result.add(prev.get(0));
            }
            prev.set(0,root);
        }
        
        if(root.right!=null){
            inOrder(root.right,prev,result);
        }
    }
    
    public static void main(String[] args) {
		Node root = new Node(10);
		Node child1 = new Node(5);
		Node child2 = new Node(8);
		Node child3 = new Node(2);
		Node child4 = new Node(20);
		root.left=child1;
		root.right=child2;
		child1.left=child3;
		child1.right=child4;
		correctBST(root);
	}

}
