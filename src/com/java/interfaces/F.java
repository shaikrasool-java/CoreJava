package com.java.interfaces;

interface Girl{
	
	void test1();
	void test2();
}

abstract class Boy{
	void test3(){
		System.out.println("from test3");
	}
	abstract void test4();
	
	
}



public class F extends Boy implements Girl{
	
	public void test1(){
		System.out.println("from test1");
	}
	public void test2(){
		System.out.println("from test2");
	}
	void test4(){
		System.out.println("from test4");
	}
	
	public static void main(String[] args) {
		
		F f=new F();
		f.test1();
		f.test2();
		f.test3();
		f.test4();
		System.out.println("done");
 	}
	
}
