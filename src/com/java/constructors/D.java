package com.java.constructors;

public class D {

	int x=test();
	D(){
		System.out.println("D():"+x);
		x=10;
	}
	/* D() :- here this constructor treated as a method, then no compile time error and no run time error...
	         program will terminate successfully
	
	{
		System.out.println("D():"+x);
		x=30;
	}*/
	int test(){
		System.out.println("test:"+x);
		return 20;
	}
	public static void main(String[] args) {
		System.out.println("main begin...");
		D d=new D();
		System.out.println(d.x);
		System.out.println("main end");
	}

}
