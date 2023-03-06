package gfg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTriplets {
	public boolean findTriplets(int arr[] , int n)
    {
       Set<Integer> sums = new HashSet<>();
       Set<Integer> sums2= new HashSet<>();
       
       for(int num:arr){
           if(num<0){
               sums.add(Math.abs(num));
           }
       }
       
       for(int num:arr){
           if(num>0){
               sums2.add(num);
           }
       }
       
       Arrays.sort(arr);
       
       //positive case, a+b = -c
       for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
               continue;
           }
           int sum=arr[i];
           for(int j=i+1;j<arr.length;j++){
               if(sums.contains(sum + arr[j])){
                   return true;
               }
           }
       }
       
       //Negative case, -a-b = c
       for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               break;
           }
           int sum=arr[i];
           for(int j=i+1;arr[j]<0 && j<arr.length;j++){
               if(sums2.contains(Math.abs(sum + arr[j]))){
                   return true;
               }
           }
       }
       
       return false;
       
    }
}
