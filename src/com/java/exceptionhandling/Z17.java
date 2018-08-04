package com.java.exceptionhandling;

public class Z17 {

	public static void main(String[]args){
		
		System.out.println(1);
		try{
			Class.forName("");
			}
		catch(ClassNotFoundException clf){
			System.out.println(2);
			}
		System.out.println(3);
	}
}
