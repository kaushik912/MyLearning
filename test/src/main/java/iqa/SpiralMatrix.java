package iqa;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public static void printSpiral( int [][] matrix, int n,int m, List<Integer> result){
		
		
		while(n >0 && m>0) {
			printRow1(matrix,n,m,result);
			printCol1(matrix,n,m,result);
			printRow2(matrix,n,m,result);
			printCol2(matrix,n,m,result);
			
			int n1= n-2;
			int m1=m-2;
			if(n1==0 || m1==0) {
				break;
			}
			if(n1>0 && m1>0) {
				int[][] pruned = new int[n1][m1];
				for(int i=0;i<n1;i++) {
					for(int j=0;j<m1;j++) {
						pruned[i][j]=matrix[i+1][j+1];
					}
				}
				matrix = pruned;
				n=n1;
				m=m1;
			}
			
		}
		
		
	}
	
	static void printRow1(int[][] matrix, int n, int m, List<Integer> result){
		for(int j=0;j<m-1;j++) {
			result.add(matrix[0][j]);
		}
	}
	
	static void printRow2(int[][] matrix, int n, int m, List<Integer> result){
		for(int j=m-1;j>=1;j--) {
			result.add(matrix[n-1][j]);
		}
	}
	
	
	
	static void printCol1(int[][] matrix, int n, int m, List<Integer> result){
		for(int i=0;i<n-1;i++) {
			result.add(matrix[i][m-1]);
		}
	}
	
	static void printCol2(int[][] matrix, int n, int m, List<Integer> result){
		for(int i=n-1;i>=1;i--) {
			result.add(matrix[i][0]);
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		List<Integer> result = new ArrayList<>();
		
		printSpiral(matrix,4,4,result);
		
		result.forEach(System.out::println);
		
	}

}
