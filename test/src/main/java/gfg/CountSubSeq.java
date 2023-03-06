package gfg;

public class CountSubSeq {
	
	static int solution=0;
    static int  subsequenceCount(String S, String T)
    {
	   subCount(S,T);
	   int result = solution;
	   solution=0;
	   return result;
    }
    
    static void subCount(String S, String T){
        
        if(T.length()==0){
            solution++;
            return;
        }
        
        char firstT = T.charAt(0);
	    int sLen = S.length();
	    
	    for(int i=0;i<sLen;i++){
	        if(S.charAt(i)==firstT){
	        	subCount(S.substring(i+1), T.substring(1));
	        }
	    }
    }
    
    public static void main(String[] args) {
		int result = subsequenceCount("bqnana","ban");
	}

}
