package com.java.constructors;

public class P {

	P(){
		System.out.println("P()");
	}
	P(int i){
		this();
		System.out.println("P(int i)");
	}
	public static void main(String[] args) {
		P p=new P();
	System.out.println();
	P p1=new P(10);
	System.out.println();
	
	}
	


}
