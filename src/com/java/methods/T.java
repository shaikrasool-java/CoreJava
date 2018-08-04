package com.java.methods;

public class T {

	public static int test(){
		
		System.out.println("from test");
		return 10;
		
	}

	public static void main(String[] args) {
		
		System.out.println("main begin");
		
		int i=test();
		int j=i+test();
		int k=i+test()+j+test();
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println(test());
		System.out.println("main end");
	}
}
