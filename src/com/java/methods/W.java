package com.java.methods;

public class W {
	public static void test(int i){
		System.out.println("from test..."+i);
		
	}

	public static void main(String[] args) {
		System.out.println("from main");
	//test();	in this line we must declare a value,
		// coz of it is parameterized method...
		test(10);
	}
}
