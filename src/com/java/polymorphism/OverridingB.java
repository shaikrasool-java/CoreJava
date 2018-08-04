package com.java.polymorphism;

interface Ab{
	void test();
}
public class OverridingB implements Ab{
	public void test() {
	System.out.println("from test");
}
	public static void main(String[] args) {
		OverridingB ob=new OverridingB();
		ob.test();
	}
	
}
