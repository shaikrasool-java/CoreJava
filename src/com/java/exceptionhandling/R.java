package com.java.exceptionhandling;

public class R {

	public static void main(String[]args){
		System.out.println("statement one");
		try{
			System.out.println("statement two");
			int i=10/0;
			
			System.out.println("statement three");
		}finally {
			
		}
	}
}
