package com.java.non_statics;

public class S {

	
	int i;
	void test(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		S s=new S();
		
		System.out.println(s.i);
		s.test();
	}
}
