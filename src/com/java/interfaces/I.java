package com.java.interfaces;

interface Nope{
	void test1();
	void test2();
}

class Oxy{
	public void test2(){
		
		System.out.println("from test-2");
	}
}
public class I extends Oxy implements Nope {

	public void test1(){
		this.test2();
		System.out.println("from test-1");
	}
	
	public static void main(String[] args) {
		 I i=new I();
		 i.test1();
		 System.out.println();
		 i.test2();
	}
}
