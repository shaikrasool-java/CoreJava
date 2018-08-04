package com.java.statics;

public class K {
 
	static int i;
	static void test(){
		System.out.println("test 1:"+i);
		i=20;
		System.out.println("test 2:"+i);
	}
	public static void main(String[] args) {
		System.out.println("main 1:"+i);
		i=10;
		test();
		System.out.println("main 2:"+i);
	}
}
