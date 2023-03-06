package iqa;

public class MergeSorted {
	
	public static void merge(int[] arr1, int[] arr2, int m , int n) {
		
		int r1 = m-1;
		int r2 = n-1;
		
		int k= m+n-1;
		
		while(r1>=0 && r2>=0) {
			if(arr1[r1] > arr2[r2]) {
				arr1[k--]=arr1[r1];
				r1--;
			}else {
				arr1[k--]=arr2[r2];
				r2--;
			}
		}
		
		while(r1>=0) {
			arr1[k--]=arr1[r1];
			r1--;
		}
		
		while(r2>=0) {
			arr1[k--]=arr2[r2];
			r2--;
		}
		
		
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,8,0,0,0};
		int[] arr2 = {2,2,6};
		merge(arr1,arr2,4,3);
		System.out.println(arr1);
	}

}
