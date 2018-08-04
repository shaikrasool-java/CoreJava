package com.java.constructors;

public class X {

	{
		System.out.println("from instace block I");
	}
	X(int i){
		System.out.println("X(int i)");
	}
	X(){
		System.out.println("X()");
	}
	X(double d){
		System.out.println("X(double d)");
	}
	public static void main(String[] args) {
		
		X x=new X();
		X x1=new X(110.0);
		X x2=new X(10);
	}
}
