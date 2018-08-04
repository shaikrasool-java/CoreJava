package com.java.statics;

public class S {

	static int i=test();
	static int j=test();
	static int test(){
		System.out.println("a:"+i+","+j);
		main(null);
		System.out.println("b:"+i+","+j);
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("c:"+i+","+j);
		i=100;
		j=300;
	}
}
