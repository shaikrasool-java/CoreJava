package com.java.interfaces;

interface Ever{
	
	void test1();
	void test2();
}

abstract class Fun implements Ever{
	
	public void test1(){
		System.out.println("from test1");
	}
}

public class E extends Fun{
	public void test2(){
		System.out.println("from test...2");
	}
	public static void main(String[] args) {
		E e=new E();
		e.test1();
		e.test2();
		System.out.println("done");
	}
	

}
