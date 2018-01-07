package com.lavina.learning.utils;

import java.io.IOException;

public class Maths {
	
	public int divide(int a, int b) throws ArithmeticException {
		
		int c = 0;
		
		try{

			c = a/b;
			
		} catch(ArithmeticException e){
			System.out.println("You cannot divide by 0");
			throw e;
		}
		
		return c;
	}
	
	
	
	public int sum(int a, int b){
		
		int c = a + b;
		return c;
		
	}
	
	public int getDataAtIndex(int[] array, int index){
		
		return array[index];
		
	}
	
	public void readFromFile(String fileName) throws IOException {
		//business logic
		//can be whatever
	}
	
	public void throwMeAnException() throws Exception {
		
		throw new Exception();
		
	}
	
	

}
