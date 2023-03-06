package gfg;

public class RotateArray {
	
	 //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        for(int i=0,j=d; i<d && j<arr.length;i++,j++){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        int lastVal = arr[arr.length-1];
        
        int shifts = d;
        if( d> n-d){
            shifts=n-d;
        }
        for(int i=arr.length-1;i>shifts;i--){
            if(i-1>=0){
                arr[i]=arr[i-1];
            }
            
        }
        
        arr[shifts]=lastVal;
        
    }
    
    public static void main(String[] args) {
		int[] arr = {40,13,27,87,95,40,96,71,35,79,68,2,98,3,18,93,53,57,2,81,87,42,66,90,45,20,41,30,32,18,98,72,82,76,10,28,68,57,98,54,87,66,7,84,20,25,29,72,33,30,4,20,71,69,9,16,41,50,97,24,19,46,47,52,22,56,80,89,65,29,42,51,94,1,35,65,25};
		System.out.println(arr.length);
		rotateArr(arr,69,arr.length);
		
	}

}
