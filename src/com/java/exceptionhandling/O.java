package com.java.exceptionhandling;

public class O {
	public static void main(String[]args){
		System.out.println("statement one");
	
	try{
		System.out.println("statement two");
		int[] i=new int[999999999];
		System.out.println("statement three");
	}
	catch(OutOfMemoryError omr){
		
		System.out.println("from catch");
	}
	System.out.println("statement four");
	
	}

}
