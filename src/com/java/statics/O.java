package com.java.statics;

public class O {
	
	static int i=test2();
	static int j=test1();
	
	static int test1(){
		System.out.println("test 1="+i+","+j);
		return 10;
		
	}
	
	static int test2(){
		System.out.println("test 2="+i+","+j);
		return 20;
	}
	
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		System.out.println("main end");
	}

}
