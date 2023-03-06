package iqa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RegexMatching {
	
	public static void main(String[] args) {
		String pattern = "ab*a";
		String target = "aa";
		List<Boolean> result = new ArrayList<>();
		isMatching(pattern,target,0,0,result);
		if(result.size()>0) {
			boolean answer = result.get(0);
			System.out.println(answer);
		}else {
			System.out.println(false);
		}
		
		List<List<String>> testcases = new ArrayList<>();
		testcases.add(Arrays.asList("ab*ac*a","aaa","true"));
		testcases.add(Arrays.asList("a.a","aaa","true"));
		testcases.add(Arrays.asList("aa.a","aaa","false"));
		testcases.add(Arrays.asList("ab*a","aaa","true"));
		testcases.add(Arrays.asList("a*a","aaa","true"));
		testcases.add(Arrays.asList("a*a","bbb","false"));
		checkTestcase(testcases);
		
	}
	
	private static void checkTestcase(List<List<String>> testcases) {
		testcases.forEach((list)->{
			List<Boolean> answer = new ArrayList<>();
			System.out.print("checking for :"+ list.get(0));
			isMatching(list.get(0),list.get(1),0,0,answer);
			boolean finalResult = answer.size()>0 ? answer.get(0):false;
			
			System.out.println(", expected==actual,"+ (new Boolean(list.get(2)).booleanValue()==finalResult));
			
		});
		
	}

	public static void isMatching( String pattern, String target, int pIndex, int tIndex, List<Boolean> result) {
		
		if(result.size()>0) {
			return ;
		}
		
		if(tIndex == target.length() && pIndex == pattern.length()) {
			result.add(true);
			return;
		}
		
		
		
			char firstChar = pattern.charAt(pIndex);
			boolean isSecondCharPresent = true;
			
			if(pIndex+1 >=pattern.length()) {
				isSecondCharPresent=false;
			}
			
			if(firstChar=='.') {
				//it matches any string, so simply move both
				isMatching(pattern,target, pIndex+1,tIndex+1,result);
			}
			else {
				char secondChar=' ';
				if(isSecondCharPresent) {
					secondChar = pattern.charAt(pIndex+1);
				}
				
				if(!isSecondCharPresent || secondChar!='*') {
					
					if(tIndex < target.length()) {
						
						char firstTarget = target.charAt(tIndex);
						//firstChar!='.' and secondChar!='*'
						if(firstChar!=firstTarget) {
							result.add(false);
							return;
						}else {
							isMatching(pattern,target,pIndex+1,tIndex+1,result);
						}
						
					}
					
				}else {
					if(tIndex < target.length()) {
						//firstChar!='.' && secondChar='*'
						 isMatching(pattern,target,pIndex,tIndex+1,result);
					}
					 isMatching(pattern,target,pIndex+2,tIndex,result);
					
					
				}
			}
		
		
		
		
	}

}
