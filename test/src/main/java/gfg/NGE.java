package gfg;

public class NGE
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long minDiff = Long.MAX_VALUE;
        long nge=arr[n-1];
        int index=-1;
        long[] result = new long[n];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]> nge){
                arr[i]=-1;
                nge=arr[i];
            }else{
                if(nge-arr[i] < minDiff ){
                    index=i;
                    minDiff = nge-arr[i];
                }
                if(index!=-1 && arr[i]< arr[index]){
                    nge=arr[index];
                    System.out.println(nge);
                }
                result[i]=nge;
            }
        }
        
        result[n-1]=-1;
        return result;
    }
    
    public static void main(String[] args) {
		long[] arr = {1,3,2,4};
		long [] result =nextLargerElement(arr, 4);
		
	}
    
}