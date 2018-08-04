package com.java.constructors;

public class B {

	int i;
	int j;
	B(){
		System.out.println("B():i="+i);
		System.out.println("B():j="+j);
		i=10;
		j=20;
	}
	public static void main(String[] args) {
		
		System.out.println("main begin...");
		B b=new B();
		System.out.println("from main:i="+b.i);
		System.out.println("from main:j="+b.j);
		System.out.println("main end...");
	}
}
