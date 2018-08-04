package com.java.non_statics;

public class F {

	int i;
	void test1(){
		System.out.println("from test1");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		F f=new F();
		f.test1();
		System.out.println(f.i);
		System.out.println("main end");
	}
}
