package com.java.abstracts;

abstract class Car{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

public class C extends Car{
	void test1(){
		System.out.println("from test1");
	}
	void test2(){
		System.out.println("from test2");
		
	}
	void test3(){
		System.out.println("from test3");
	}
		public static void main(String[] args) {
			C c=new C();
			
			System.out.println("main begin");
			c.test1();
			c.test2();
			c.test3();
			System.out.println("main end");
		}

}
