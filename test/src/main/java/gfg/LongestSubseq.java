package gfg;

import java.util.ArrayList;
import java.util.List;

public class LongestSubseq {
	
	static int longestSubsequence(int N, int A[])
    {
        int maxLen = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            int v1 = A[i];
            int len=1;
            List<Integer> result = new ArrayList<>();
            result.add(v1);
            for(int j=i+1;j<N;j++){
                int v2 = A[j];
                if( Math.abs(v1-v2)==1){
                	result.add(v2);
                    v1 = v2;
                    len++;
                }
            }
            if(maxLen <= len) {
            	maxLen = len;
            	result.forEach(System.out::println);
            	System.out.println("---");
            }
            
        }
        
        return maxLen;
    }
	
	public static void main(String[] args) {
		//int[] arr = {431,714,161,440,760,979,525,760,992,603,956,939,397,513,691,339,188,709,816,549,6,606,392,702,739,814,446,281,372,155,252,96,765,894,966,439,338,137,293,751,985,837,106,529,857,442,52,224,561,83,251,253,765,336,254,133,556,69,594,382,717,108,355,74,811,839,912,331,71,336,570,15,149,436,678,62,793};
		int[] arr = {10, 9, 4, 5, 4, 8, 6};
		longestSubsequence(arr.length, arr);
	}

}
