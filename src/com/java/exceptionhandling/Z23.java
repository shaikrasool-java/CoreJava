package com.java.exceptionhandling;

public class Z23 {

	public static void main(String[] args) {
		
		System.out.println(1);

	try{
		System.out.println(2);
		test();
		System.out.println(3);
	}
	catch(ClassNotFoundException cnf){
		System.out.println(cnf);
	}
	
	System.out.println(4);
	}

	public static void test()throws ClassNotFoundException{
		System.out.println(5);
		Class.forName("");
		System.out.println(6);
	}

}
