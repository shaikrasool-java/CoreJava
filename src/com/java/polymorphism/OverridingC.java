package com.java.polymorphism;

class Abc{
	void test(){
		System.out.println("from test()");
	}
}

public class OverridingC  extends Abc{
void test() {

	System.out.println("from main test()");
	super.test();
}
	public static void main(String[] args) {
		 OverridingC oc=new OverridingC();
		 oc.test();
		 
	}
	
}
