package com.java.constructors;

public class M {

	M(int i, double d){
		System.out.println("M(int i, double d)");
	}
	M(double d, int i){
		System.out.println("M(double d, int i)");
	}
	public static void main(String[] args) {
		M m=new M(10, 2.0);
		System.out.println("--------------");
		System.out.println();
		M m1=new M(1.0, 2);
		
		
	}
}
