package com.java.non_statics;

public class K {

	int i;
	public static void main(String[] args) {
		K k=new K();
		K k1=new K();
		k.i=10;
		k1.i=20;
		System.out.println(k.i);
		System.out.println(k1.i);
	}
}
