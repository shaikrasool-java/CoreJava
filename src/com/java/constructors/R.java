package com.java.constructors;

public class R {

	R(){
		this(1,2);
		System.out.println("R():");
	}
	R(int i){
		
		System.out.println("R(int i)");
	}
	R(int i, int j){
		System.out.println("R(int i, int j)");
	}
	public static void main(String[] args) {
		R r=new R();
		System.out.println();
		R r1=new R(10,20);
		System.out.println();
		R r2=new R(100);
		
	}
}
