package com.java.polymorphism;

class Abcd{
	void test(){
		System.out.println("from abcd test()");
	}
}
public class OverridingD extends Abcd{

	void test(){
		System.out.println("from overridingD begin");
		super.test();
		System.out.println("from overridingD end");
	}
	public static void main(String[] args) {
		OverridingD od=new OverridingD();
		System.out.println("main begin");
		od.test();
		System.out.println("main end");
	}
}
