package com.java.exceptionhandling;
// java.lang.OutOfMemoryError:
public class F {
	public static void main(String[]args){
		System.out.println("statement-start");
		int[] i=new int[99999999];
		System.out.println(i);
		System.out.println("statement-end");
	}

}
