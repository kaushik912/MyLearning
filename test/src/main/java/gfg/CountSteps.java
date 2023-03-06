package gfg;

public class CountSteps {

	 static long countWays(int n)
	    {
	        long[] result = new long[n+1];
	        
	        if(n==1) {
	        	return 1;
	        }
	        if(n==2) {
	        	return 2;
	        }
	        if(n==3) {
	        	return 4;
	        }
	        
	        result[0]=0;
	        result[1]=1;
	        result[2]=2;
	        result[3]=4;
	        
	        
	        for(int i=4;i<=n;i++){
	            result[i]=(result[i-1]+result[i-2]+result[i-3])%1000000007;
	        }
	        
	        return result[n];
	    }
	 public static void main(String[] args) {
		long result = countWays(5);
		System.out.println(result);
	}
}
