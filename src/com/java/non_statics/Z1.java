package com.java.non_statics;

public class Z1 {

	int i;
	static void test(Z1 z){
		z.i=10;
		
	}
	public static void main(String[] args) {
		Z1 z1=new Z1();
		z1.i=20;
		System.out.println("a:"+z1.i);
		test(z1);
		System.out.println("b:"+z1.i);
	}
	
}
