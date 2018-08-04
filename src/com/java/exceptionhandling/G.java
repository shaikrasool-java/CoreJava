package com.java.exceptionhandling;

//java.lang.StackOverflowError
public class G {

	public static void main(String[]args){
		System.out.println("statement-start");
		main(args);
		System.out.println("statement-end");
	}
}
