package com.java.polymorphism;

public class OverloadingB {
 
	public void test(){
		System.out.println("test()");
	}
	void test(int i){
		System.out.println("test(int i)");
	}
	public static void main(String[] args) {
		OverloadingB ob=new OverloadingB();
		ob.test(10);
		System.out.println();
		ob.test();
		 
	}
}
