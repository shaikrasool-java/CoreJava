package com.java.exceptionhandling;
//java.lang.StackOverflowError
class H{
}
class I{
	public static void main(String[]args){
		System.out.println("statement-start");
		H h=new H();
		//System.out.println(h);
		System.out.println("statement-end");
	}
}
