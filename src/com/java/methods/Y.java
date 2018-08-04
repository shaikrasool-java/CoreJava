package com.java.methods;

public class Y {

	static double test( boolean b,
						int i,
						char c,
						int k){
		System.out.println("from test");
		System.out.println(b);
		System.out.println(i);
		System.out.println(c);
		System.out.println(k);
return 10.20;
	}
	
	public static void main(String[] args) {
		System.out.println("from main");
		double d=test(true,100,'a',200);
		System.out.println(d);
	}
}
