package com.java.methods;

public class V {

	
	public static String test(){
		System.out.println("from test");
		return"rasool";
		
	}
	public static void main(String[] args) {
		
		System.out.println("main begin");
		test();
		String s=test();
		System.out.println(s);
		System.out.println(test());
		System.out.println("main end");
		
	}
}
