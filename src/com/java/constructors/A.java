package com.java.constructors;

public class A {

	int i;
	A(){
		System.out.println("A():"+i);
		i=10;
		
	}
	public static void main(String[] args) {
		
		System.out.println("main begin....");
		A a=new A();
		System.out.println(a.i);
		System.out.println("main end....");
	}
}
