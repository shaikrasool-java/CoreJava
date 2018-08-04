package com.java.interfaces;

interface Pink{
	void test1();
}
interface Quick{
	void test2();
}

public class J implements Pink,Quick{

	public void test1(){
		System.out.println("from test-1");
	}
	public void test2(){
		this.test1();
		//this.test2();
		System.out.println("from test-2");
	}
	public static void main(String[] args) {
		
			J j=new J();
		
			j.test1();
			j.test2();
		
		
	}
}
