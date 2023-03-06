package gfg;

import java.util.ArrayList;

public class SubArraySum {
	 static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        // Your code here
	       int start=0;
	       int end=0;
	       int sum=0;
	       boolean found=false;
	       while(end< n){
	           sum+=arr[end++];
	           
	           if(sum==s){
	               found=true;
	               break;
	           }else if(sum>s){
	               //sum > s
	               while(sum > s){
	                   sum = sum-arr[start];
	                   start++;
	               }
	               
	               if(sum==s) {
	            	   found=true;
	            	   break;
	               }
	           }
	       }
	       
	       ArrayList<Integer> result = new ArrayList<>();
	       if(!found){
	           result.add(-1);
	       }else{
	    	 
	           result.add(start+1);
	           result.add(end-1+1);
	       }
	       
	       
	        return result;
	    }
	 
	 public static void main(String[] args) {
		 int[] arr = {1,2,3,9,11};
		//int[] arr = {1,2,3,7,5};
		//int[] arr = {11,12,13};
		ArrayList<Integer> subarraySum = subarraySum(arr,arr.length,11);
		subarraySum.forEach(System.out::println);
	}

}
