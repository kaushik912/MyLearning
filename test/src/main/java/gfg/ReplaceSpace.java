package gfg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceSpace {

	public static void main(String[] args) {
		String input = "We are happy.";
		String expected = "We%20are%20happy.";
		
		String[] words = input.split("\\s+");
		
		List<String> list = Arrays.asList(words);
		String result = list.stream().collect(Collectors.joining("%20"));
		System.out.println(result);
		int spaceCount = countSpaces(input);
		System.out.println(spaceCount);
		
		String delim="%20";
		char[] newString = new char[input.length()-spaceCount+ spaceCount*delim.length()];
		
		int k=newString.length-1;
		
		for(int i=input.length()-1; i>=0;i--) {
			if(input.charAt(i)!=' ') {
				newString[k--]=input.charAt(i);
			}else {
				for(int j=delim.length()-1;j>=0;j--) {
					newString[k--]=delim.charAt(j);
				}
			}
		}
		
		System.out.println(new String(newString));
		
		
	}
	
	static int countSpaces(String s) {
		boolean inSpace=false;
		int spaceCount=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && !inSpace) {
				inSpace=true;
				spaceCount++;
			}
			
			if(s.charAt(i)!=' ' && inSpace) {
				inSpace=false;
			}
			
		}
		
		return spaceCount;
	}
}
