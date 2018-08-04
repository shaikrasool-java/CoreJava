package com.java.statics;

public class R {

	static int i=test();
	public static int test(){
		System.out.println("test begin="+i);
		i=2;
		main(null);
		System.out.println("test end="+i);
		return 3;
		
	}
	public static void main(String[]args){
		
		System.out.println("main ="+i);
		i=4;
	}
}
