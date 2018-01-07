package com.lavina.learning.exceptionhandling;

import java.io.IOException;

import com.lavina.learning.utils.Maths;

public class LearnExceptions {

	public static void main(String[] args) {
		
		Maths m1 = new Maths();
		
		//*******************************************************************************************//

		int result = m1.divide(10, 2);
		System.out.println(result);
		
		//*******************************************************************************************//
		
		try{
			
			int r2 = m1.divide(10, 0);
			System.out.println(r2);

		} catch(Exception e){
			System.out.println("In catch of client");
		}
		
		//*******************************************************************************************//

		int r3 = m1.sum(5, 6);
		System.out.println(r3);
		
		try{
			
			m1.readFromFile("testFileName.txt");
			
		} catch(IOException e){
			
		} 

		//*******************************************************************************************//

		try{

			//Operation 1
			int[] array = {10,11,12,13};
			int data = m1.getDataAtIndex(array, 4);
			System.out.println(data);
			
			//Operation 2
			m1.divide(3, 0);
			
		} catch(ArithmeticException e){
			
			System.out.println("Please don't do divide by zero operation");
			
		} catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Please pass a valid index to get data from your array");
			
		}
		
		//*******************************************************************************************//

		try{

			//Operation 1
			int[] array = {10,11,12,13};
			int data = m1.getDataAtIndex(array, 2);
			System.out.println(data);
			
			//Operation 2
			m1.divide(3, 0);
			
		} catch(ArithmeticException e){
			
			System.out.println("Please don't do divide by zero operation");
			
		} catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Please pass a valid index to get data from your array");
			
		}
		
		//*******************************************************************************************//

		try{

			//Operation 1
			int[] array = {10,11,12,13};
			int data = m1.getDataAtIndex(array, 2);
			System.out.println(data);
			
			//Operation 2
			m1.divide(6, 2);
			
			//Operation 3
			m1.throwMeAnException();
			
		} catch(ArithmeticException e){
			
			System.out.println("Please don't do divide by zero operation");
			
		} catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Please pass a valid index to get data from your array");
			
		} catch(Exception e){
			
			System.out.println("We are so sorry, we encountered an error at out end.");
			
		}
		

		
	}
	
	

}
