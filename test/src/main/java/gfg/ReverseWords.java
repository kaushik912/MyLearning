package gfg;

public class ReverseWords {

	 static String reverseWords(String S)
	    {
	       String[] words = S.split("\\.");
	       StringBuffer sb = new StringBuffer();
	       for(int i=words.length-1;i>=0;i--){
	           sb.append(words[i]);
	           if(i!=0){
	               sb.append(".");
	           }
	       }
	       return sb.toString();
	    }
	 public static void main(String[] args) {
		System.out.println(reverseWords("i.like.chocolate"));
		
	}
	 
}
