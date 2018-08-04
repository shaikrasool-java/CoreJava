package com.java.non_statics;

public class D {

	void test(){
		System.out.println("from test");
	}
	public static void main(String[] args) {
		
		D d=new D();
		System.out.println("main begin");
		d.test();
		System.out.println("--------------");
		d.test();
		System.out.println("--------------");
		System.out.println("main end");
	}
}
