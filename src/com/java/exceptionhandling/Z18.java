package com.java.exceptionhandling;

public class Z18 {

	public static void main(String[] args) {

		System.out.println(1);
	
	try{
	//Class.forName("");
	//here we will get compile time error...
	}
	catch(ArithmeticException ae){
		System.out.println(2);
	}
	System.out.println(3);
	
	}

}
