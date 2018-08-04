package com.java.statics;

public class J {

	static int i;
	static void test(){
		System.out.println("test:"+i);
		i=20;
	}
	public static void main(String[] args) {
		
		System.out.println("main 1:"+i);
		test();
		System.out.println("main 2:"+i);
	}
}
