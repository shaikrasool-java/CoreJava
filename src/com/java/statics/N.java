package com.java.statics;

public class N {
	
	static int i=test();
	static int j=test();
	public static int test(){
		System.out.println("test:"+i+","+j);
		return 10;
		
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		System.out.println("main end");
	}
	
}
