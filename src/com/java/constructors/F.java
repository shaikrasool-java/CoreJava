package com.java.constructors;

public class F {

	static int i;
	F(){
		i++;
	}
	public static void main(String[] args) {
	
		System.out.println("main begin");
		F f1=new F();
		F f2=new F();
		F f3=new F();
		F f4=new F();
		
		System.out.println(i);
		System.out.println("main end");
	}
}
