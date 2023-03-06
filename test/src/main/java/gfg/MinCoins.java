package gfg;

public class MinCoins {
	
	static long minCount=Integer.MAX_VALUE;
    public static long minimumNumberOfCoins(int coins[],int numberOfCoins,int value)
    {
        minCoins(coins,value,0);
        
        long result =minCount;
        minCount=Integer.MAX_VALUE;
        return result;
    }
    
    static void minCoins(int[] coins, int value, long count){
        if(value==0){
            minCount = Math.min(minCount,count);
            return;
        }
        for(int i=0;i<coins.length;i++){
            if(coins[i]<= value){
                minCoins(coins,value-coins[i],count+1);
            }
        }
    }
    
    public static void main(String[] args) {
    	int[] coins =  {2,5,3,6};
		long count =minimumNumberOfCoins(coins, coins.length, 10);
		System.out.println(count);
	}

}
