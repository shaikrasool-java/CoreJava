package com.java.statics;

public class P {
	static int x=test3();
	static int y=test2();
	static int z=test1()+test2();
	
	public static int test1(){
		System.out.println("from test-1...");
		System.out.println(x+",");
		System.out.println(y+",");
		System.out.println(z);
		return 10;
	}
	static int test2(){
		System.out.println("from test-2...");
		System.out.println(x+",");
		System.out.println(y+",");
		System.out.println(z);
		return 20;
	}
	
	static int test3(){
		System.out.println("from test-3...");
		System.out.println(x+",");
		System.out.println(y+",");
		System.out.println(z);
        return 30;
	}


	public static void main(String[]args){
		System.out.println("main begin");
		System.out.println(x);
		System.out.println(y);  
		System.out.println(z);
		System.out.println("main end");
	}
	
}
