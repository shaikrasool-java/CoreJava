package com.java.exceptionhandling;

public class Z21 {

	public static void main(String[] args) {
	
		System.out.println(1);
		
		try{
			test();
		}
		catch(ClassNotFoundException clf){
			System.out.println(clf);
		}
		System.out.println(2);
		
	}

	public static void test()throws ClassNotFoundException{
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}
