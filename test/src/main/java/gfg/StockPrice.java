package gfg;

import java.util.ArrayList;

public class StockPrice {

	static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
		int min = A[0];
		int diff = 0;
		int maxDiff = Integer.MIN_VALUE;
		int end = -1;
		int start = 0;
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for (int i = 1; i < A.length; i++) {
			diff = A[i] - min;
			if (diff>0 && maxDiff < diff) {
				// note this i
				maxDiff = diff;
				end = i;
			}
			if (diff<0) {

				if (maxDiff > 0) {
					if (end != -1) {
						ArrayList<Integer> solution = new ArrayList<>();
						solution.add(start);
						solution.add(end);
						result.add(solution);
					}
				}
				if(end!=-1) {
					start = end + 1;	
				}else {
					start=i;
				}
				
				i=start;
				min = A[start];
				maxDiff = Integer.MIN_VALUE;
				end = -1;
			}
		}

		if (end != -1) {
			ArrayList<Integer> solution = new ArrayList<>();
			solution.add(start);
			solution.add(end);
			result.add(solution);
		}

		return result;
	}

	public static void main(String[] args) {
		 int arr[] =
		 {822,754,1689,305,214,782,1463,1432,1382,1734,948,231,210,1676,877,670,1384,725,1370,412,724,371,928,358,533,1031,850,1555,1064,845,1692,514,630,1333,1640,315,1639,1792,1779,1325,1619,1400,378,145,913,901,1652,530,1259,880,303,685,1586};
		//int arr[] = { 3, 10, 7, 9, 2, 20 };
		ArrayList<ArrayList<Integer>> stockBuySell = stockBuySell(arr, arr.length);
		System.out.println(arr.length);
		stockBuySell.forEach(System.out::println);
	}

}
