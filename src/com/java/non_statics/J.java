package com.java.non_statics;

public class J {

	double d;
	public static void main(String[] args) {
	
		J j=new J();
		System.out.println(j.d);
		System.out.println(j.hashCode());
		
		J j1=new J();
		j1.d=10;
		System.out.println(j.d);
		System.out.println(j1.d);
		System.out.println(j1.hashCode()!=j.hashCode());
		
		J j2=new J();
		j2.d=20.22;
		System.out.println(j.d);
		System.out.println(j1.d);
		System.out.println(j2.d);
		System.out.println(j2.hashCode());
	
	}
}
