package com.java.interfaces;

interface Car{
	void test();
	public static void sta(){
		System.out.println("from static");
	}
	public default void def(){
		System.out.println(" from default");
	}
}


public class C implements Car{

	public void test(){
		System.out.println("from test");
	}
	public static void main(String[] args) {

		System.out.println("main begin");
		C c=new C();
		c.test();
		Car.sta();
		c.def();
		System.out.println("main end");
	}

}
