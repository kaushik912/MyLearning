package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class MyString {
	public MyString(String data) {
		this.data = data;
	}

	private String data;
	
	public static void main(String args[]) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		String str1 = new String("Hello World.");
		String str2 = new String("Hello World.");
		map1.put(str1, new Integer(10));
		map1.put(str2, new Integer(20));
		Map<MyString, Integer> map2 = new HashMap<MyString, Integer>();
		MyString str3 = new MyString(str1);
		MyString str4 = new MyString(str2);
		map2.put(str3, new Integer(10));
		map2.put(str4, new Integer(20));
		System.out.println(map1.get(str1)); //20
		System.out.println(map2.get(str3));//10
	}
}

	

