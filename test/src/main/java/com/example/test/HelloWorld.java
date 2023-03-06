package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a Hello World!");
        
        Map<Integer,Integer> map=new TreeMap<>();
        map.put(1, 3);
        map.put(0, 1);
        map.put(-1,2);
        map.put(-2, 8);
        ArrayList<Integer> arrayList = new ArrayList<>(map.values());
        arrayList.forEach(System.out::println);
        
        int num=3;
        String s = num+"";
        String a="1";
        String b="2";
        System.out.println((a+b).compareTo(b+a));
        
        int[] arr= {250,74,659,931,273,545,879,924};
        
        String[] strings = new String[arr.length];
        
        List<String> list = new ArrayList<>();
        int k=0;
        for(int number:arr) {
        	list.add(number+"");
        	strings[k++]=number+"";
        }
        
        Arrays.sort(strings,(x,y)-> (x+y).compareTo(y+x));
        for (String string : strings) {
			System.out.println(string);
		}
        
        Collections.sort(list,(x,y)-> (x+y).compareTo(y+x));
        System.out.println(list);
        list.stream().map(x1 -> new Integer(x1)).collect(Collectors.toList());
        
        int[] arr1 = {1,2,2,3};
        int ans = arr1[0];
        for(int i=1;i<arr1.length;i++) {
        	ans = xnor(ans,arr1[i]);
        }
        
        System.out.println( ~(1^2^2^3));
        System.out.println(ans);
        
        System.out.println(12^21);
        System.out.println(8^17);
        
        if((2^4) == 6) {
        	System.out.println("yes");
        }
        
        
        }
    
    class NumComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return 0;
		}

		
    	
    }
    
    public static int xnor(int a , int b) {
    	return ~(a^b);
    }
}
