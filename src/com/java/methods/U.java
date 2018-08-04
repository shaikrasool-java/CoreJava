package com.java.methods;

public class U {

	public static String test(){
		System.out.println("from test");
		
		return"rasool";
	}
	
	public static void main(String[] args) {
		
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
