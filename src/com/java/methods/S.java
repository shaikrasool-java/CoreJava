package com.java.methods;

public class S {

	public static int test(){
		System.out.println("from test");
		return 10;
	}
public static void main(String[] args) {
	System.out.println("main begin");
	int i=test();
	int j=i;
	System.out.println("i="+i);
	System.out.println("j="+j);
	System.out.println("main end");
	}
}
