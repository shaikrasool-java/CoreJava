package com.java.non_statics;

public class M {

	int i;
	public static void main(String[] args) {
		
		M m1=new M();
		
		M m2=m1;
		
		M m3=new M();
		
		M m4=m2;
		
		m1.i=10;
		m4.i=20;
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		
	}
}
