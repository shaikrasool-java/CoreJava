package com.java.exceptionhandling;

public class ZG {

	public static void main(String []args){
		
		 int i=0;
		 try{
			 System.out.println("from try block"+i);
			 i=20;
			 i=30/0;
			 i=40;
		 }catch(ArithmeticException ae){
			 System.out.println("from catch block ::"+i);
			
		 i=50;
		 
		 }
		finally{
			System.out.println("from finally block..."+i);
			i=60;
		}
		 System.out.println("main end..."+i);
	}
	
}
