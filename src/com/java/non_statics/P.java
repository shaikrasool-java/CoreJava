package com.java.non_statics;

public class P {

	void test(){
		System.out.println("test:"+this);
	}
	public static void main(String[] args) {
		
		P p=new P();
		System.out.println("main:"+p);
		
		p.test();
		
	}
}
