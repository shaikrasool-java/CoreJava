package com.java.polymorphism;

	class Ae{
		
		void test1(){
			System.out.println("from test1()");
			
		}
		void test2(){
			System.out.println("from test2()");
		}
	}

public class OverridingE extends Ae{

	void test1(){
		System.out.println("from OverridingE test1()");
	}
	void test2(){
		System.out.println("from overridingE test1() begin");
		super.test1();
		super.test2();
		System.out.println("from overridingE test1() end");
		
	}
	
	public static void main(String[] args) {
		OverridingE oe=new OverridingE();
		System.out.println("main begin");
		oe.test2();
		System.out.println("main end");
	}
}
