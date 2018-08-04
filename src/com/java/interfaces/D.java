package com.java.interfaces;

interface Darling{
	
	void test1();
	void test2();
	}

public class D implements Darling {
	
	public void test1(){
		System.out.println("from test1");
	}
	public void test2(){
		System.out.println("from test2");
	}
		
	public static void main(String[] args) {
		
		D d=new D();
		d.test1();
		d.test2();
		System.out.println("done...");
	}
	
}
