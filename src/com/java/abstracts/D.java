package com.java.abstracts;

abstract class Doll{
	abstract void test1();
	abstract void test2();
}

abstract class Egg extends Doll{
	void test1(){
		System.out.println("from test1");
		
	}
	}

public class D extends Egg{
	void test2(){
		System.out.println("from test2");
	}
	 public static void main(String[] args) {
		
		 D d=new D();
		 d.test1();
		 d.test2();
		 
	}
}
