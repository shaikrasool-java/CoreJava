package com.java.exceptionhandling;

public class M {

	public static void main(String[]args){
		
		String s=null;
		//String s="rasool";
		System.out.println(s);
		try{
			System.out.println("from try");
			int i=s.length();
			System.out.println(i);
			System.out.println("from try end");
							
		}
		catch(NullPointerException n){
			n.printStackTrace();
			System.out.println("from catch block");
		}
		System.out.println("statements are end...");
	}
}
