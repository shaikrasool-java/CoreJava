package com.java.statics;

public class B {

	static int i=10;
	static int j;
	static int k=i;
	static int l=j;
	static int m=l;
	public static void main(String[] args) {
		System.out.println("int i="+i);
		System.out.println("int j="+j);
		System.out.println("int k="+k);
		System.out.println("int l="+l);
		System.out.println("int m="+m);
	}
}
