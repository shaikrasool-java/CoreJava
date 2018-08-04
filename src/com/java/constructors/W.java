package com.java.constructors;

public class W {

	W(){
		System.out.println("W():");
	}
	{
		System.out.println("from instance block I");
	}
	W(int i){
		System.out.println("W(int i)");
	}
	{
		System.out.println("from instance block II");
	}
	public static void main(String[] args) {
		W w=new W();
		System.out.println("----------");
		W w1=new W(10);
		System.out.println("-----");
	}
	
}
