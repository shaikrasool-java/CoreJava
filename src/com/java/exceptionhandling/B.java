package com.java.exceptionhandling;

//java.lang.ArrayIndexOutOfBoundsException:
public class B {

	public static void main(String[]args){
		
		System.out.println("statement-one");
		System.out.println();
		int i=new int[]{1,2,3,4}[5];
		System.out.println(i);
		//here ArrayIndexOutOfBoundsException will come coz of above statement we had give 5th element 
		System.out.println("statemetn-two");
	}
}
