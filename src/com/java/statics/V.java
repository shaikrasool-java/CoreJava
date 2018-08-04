package com.java.statics;

public class V {

	static int i=test();
	static int j=10;
	static int test(){
		System.out.println("from test");
		return i=20;
		
	}
	public static void main(String[] args) {
		 System.out.println("main ");
		 System.out.println(i);
		 System.out.println(j);
	}
}
