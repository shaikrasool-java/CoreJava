package com.java.inheritance;

class Test{
	int i;
}
public class A extends Test {

	int j;
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.i);
		System.out.println(a.j);
	}
}
