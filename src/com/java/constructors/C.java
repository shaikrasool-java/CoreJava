package com.java.constructors;

public class C {

	int i=test();
	C(){
		System.out.println("C():"+i);
		i=10;
	}
	int test(){
		System.out.println("test:"+i);
		return 20;
	}
	public static void main(String[] args) {
		
		System.out.println("main begin");
		C c=new C();
		System.out.println("main :"+c.i);
		System.out.println("main end");
	}
}
