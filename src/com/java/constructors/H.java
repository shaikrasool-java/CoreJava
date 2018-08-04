package com.java.constructors;

public class H {

	static int i;
	H(){
		i++;
	}
	public static void main(String[] args) {
		H h=new H();
		System.out.println(h.i);
		H h1=new H();
		System.out.println(h1.i);
		H h2=new H();
		System.out.println(h2.i);
		H h3=new H();
		System.out.println(h3.i);
		System.out.println(h2.i);
		System.out.println(h1.i);
		System.out.println(h.i);
	}
}
