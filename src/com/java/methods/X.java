package com.java.methods;

public class X {

	public static void test(int i, char c){
		System.out.println("from test int i="+i);
		System.out.println("from test char c="+c);
	}

	public static void main(String[] args) {
		
	System.out.println("from main");
	test(10,'a');
		}
}
