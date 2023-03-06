package gfg;

import java.math.BigInteger;

public class FindTwoRepeat {
	
	static int[] findTwoElement(int arr[], int n) {
		int[] answer = new int[2];
	       
	      long e = n*(n+1)/2;
	      long a=0;
	      for(int num: arr){
	          a+=num;
	      }
	      
	     BigInteger pe = new BigInteger("1");
	     for(int i=1;i<=n;i++){
	         pe = pe.multiply( new BigInteger(i+""));
	     }
	     
	     BigInteger pa = new BigInteger("1");
	     for(int i=0;i<n;i++){
	         pa = pa.multiply(new BigInteger(arr[i]+""));
	     }
	     
	      
	     int m = (pe.multiply(new BigInteger(e-a+""))).divide(pe.subtract(pa)).intValue();
	     
	     int r = (int)(a-e)+m;
	     
	      answer[0]=r;
	      answer[1]=m;
	      
	      return answer;
	       
	    
	    }
	
	public static void main(String[] args) {
		int[] arr = {13,33,43,16,25,19,23,31,29,35,10,2,32,11,47,15,34,46,30,26,41,18,5,17,37,39,6,4,20,27,9,3,8,40,24,44,14,36,7,38,12,1,42,12,28,22,45};
		int[] res = findTwoElement(arr, arr.length);
		System.out.println(res[0]+","+res[1]);
	}

}
