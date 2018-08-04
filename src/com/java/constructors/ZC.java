package com.java.constructors;

public class ZC {

	int i;
	double d;
	ZC(int i, double d){
		this.i=i;
		this.d=d;
	}
	public static void main(String[] args) {
		ZC z=new ZC(10,20);
		System.out.println(z.i);
		System.out.println(z.d);
	}
}
