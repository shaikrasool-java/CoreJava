package com.java.non_statics;

public class W {

	int i;
	static void test(W obj){
		obj.i=10;
		
	}
	public static void main(String[] args) {
		
		W w=new W();
		System.out.println("a:"+w.i);
		w.i=20;
		test(w);
		System.out.println("b:"+w.i);
		
	}
}
