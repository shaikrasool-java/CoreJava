package com.java.abstracts;

abstract class Ball{
	
	abstract void test();
}
public class B extends Ball {
void test(){
	System.out.println("from test");
}
	public static void main(String[] args) {
		
		B b=new B();
		b.test();
		System.out.println("successfully terminated....");
		
	}
}
