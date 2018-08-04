package com.java.statics;

public class Q {

	static int i=test();
	static int test(){
		System.out.println("from test");
		main(null);
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("from main="+i);
	}
}
