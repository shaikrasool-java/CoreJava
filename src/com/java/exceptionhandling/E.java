package com.java.exceptionhandling;

//java.lang.NumberFormatException:
public class E {
	
	public static void main(String[]args){
		
		System.out.println("statement-start");
		Integer obj=new Integer("abc");
		obj.toString();
		System.out.println(obj);
		
		System.out.println("statement-end");
	}

}
