package com.java.non_statics;

public class I {

	int i;
	public static void main(String[] args) {
		
		I i1=new I();
		I i2=i1;
		i1.i=10;
		System.out.println(i1.i);
		System.out.println(i2.i);
		System.out.println("------");
		
		i2.i=20;
		System.out.println(i1.i);
		System.out.println(i2.i);
		System.out.println("-----");
	}
}
