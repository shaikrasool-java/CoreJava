package com.java.statics;

public class M {

	static int i=test();
	static int test(){
		System.out.println("from test...."+i);
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("from main...."+i );
	}
}
