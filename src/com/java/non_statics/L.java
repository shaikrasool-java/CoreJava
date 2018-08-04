package com.java.non_statics;

public class L {

	int i;
	public static void main(String[] args) {
		
		L l=new L();
		System.out.println(l.i);
		
		L l1=new L();
		System.out.println(l1.i);
		
		L l2=new L();
		System.out.println(l2.i);
		
		l.i=10;
		l1.i=20;
		l2.i=30;
		
		System.out.println(l.i);
		System.out.println(l1.i);
		System.out.println(l2.i);
	}
}
