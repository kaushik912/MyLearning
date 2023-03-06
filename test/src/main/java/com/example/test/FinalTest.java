package com.example.test;

public class FinalTest {
	
	private final int[] array;
	private final int number=0;
	
	public FinalTest(){
		array = new int[10]; //Allowed!!
		
	}
	
	public void modifyFinal1() {
		//number++; Not allowed
	}
	
	public void modifyFinal2() {
		for(int i=0;i<array.length;i++)
			this.array[i]+=1; //Allowed
	}
	
	public void modifyFinal3() {
		//array = new int[10]; Not allowed
	}
	
	

}
