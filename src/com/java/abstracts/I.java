package com.java.abstracts;

abstract class Jump{
	void test1(){ 
		System.out.println("test()");
	}
	static void test2(){
		System.out.println("from test2");
	}
	
}

public class I {
	public static void main(String[] args) {
		
		Jump.test2(); 
		
		
	}

}
