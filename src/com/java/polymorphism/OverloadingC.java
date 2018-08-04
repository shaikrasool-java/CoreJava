package com.java.polymorphism;

public class OverloadingC {
	
	int test(){
		System.out.println("test()");
		  return 10;
		
	}

	public static void main(String[] args) {
		
		OverloadingC oc=new OverloadingC();
		int i=oc.test();
		System.out.println();
		oc.test();
	}
}
