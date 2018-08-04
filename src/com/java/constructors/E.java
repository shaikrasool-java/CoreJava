package com.java.constructors;

public class E {

	static int i=test1();
	
	int j=test2();
	
	static int test1(){
		System.out.println("test 1:"+i);
		return 10;
	}
	int test2(){
		System.out.println("test 2:"+j);
		return 20;
	}
	E(){
		System.out.println("E():"+j);
		j=100;
	}
	static {
		System.out.println("SIB:"+i);
		i=200;
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println("main:"+i);
		E e=new E();
		System.out.println("main:"+e.j);
		System.out.println("main end");
	}
}
