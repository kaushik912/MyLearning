package gfg;

import java.util.HashMap;
import java.util.Map;

public class RemoveForAnagram {

	public static int remAnagrams(String s,String s1)
    {
		Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map1.get(ch)==null){
                map1.put(ch,1);
            }else{
                map1.put(ch, map1.get(ch)+1);
            }
        }
        
        
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(map1.get(ch)==null){
               if(map2.get(ch)==null){
                   map2.put(ch,1);
               }else{
                   map2.put(ch, map2.get(ch)+1);
               }
            }else{
                map1.put(ch, map1.get(ch)-1);
            }
        }
        
        int sum1 = map1.entrySet().stream()
        .mapToInt( map -> Math.abs(map.getValue()))
        .sum();
        
        int sum2 = map2.entrySet().stream()
        .mapToInt( map -> Math.abs(map.getValue()))
        .sum();
        
        return sum1+sum2;
    }
	
	public static void main(String[] args) {
		int result = remAnagrams("basgadhbfgvhads", "sjdhgvbjdsbhvbvd");
		System.out.println(result);
	}
	
}
