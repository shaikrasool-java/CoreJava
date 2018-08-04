package com.java.methods;

public class R {

	public static int test(){
		System.out.println("from test");

	return 10;
	
	}

public static void main(String[] args) {
	
	System.out.println("main begin");
	int i=test();
	System.out.println("i="+i);
	System.out.println("main end");
}
}
