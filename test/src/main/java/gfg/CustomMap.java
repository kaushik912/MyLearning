package gfg;

import java.util.HashMap;
import java.util.Map;

public class CustomMap {
	
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		int nums[] = {6,1,1,1,2,2,3};
		
		for(int num: nums){
            if(map.get(num)==null){
                map.put(num,1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }
		
		 Integer[] array = map.entrySet().stream().sorted((a,b)-> {
			if(b.getValue().equals(a.getValue())) {
				return b.getKey().compareTo(a.getKey());
			}else {
				return b.getValue().compareTo(a.getValue());
			}
		}).map(x -> x.getKey())
		.toArray(Integer[]::new);
		
		int k=2;
		int[] result = new int[k];
		int j=0;
		for(int i=0; i<k;i++) {
			result[j++]=array[i];
		}
		System.out.println(result);
		
		String s = new String("abc");
		System.out.println("ban".substring(1).substring(1));
		
		String z="n";
		String z2 = z.substring(1);
		System.out.println("z2:"+z2.length());
		
		
	}

}
