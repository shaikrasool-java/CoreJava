package com.java.constructors;

class A2{
	int i;
	int j;
}
class A3{
	int m;
	int n;
	A2 x1;
	A2 x2;
}
public class ZG {

	public static void main(String[] args) {
		A2 a1=new A2();
		a1.i=10;
		a1.j=20;
		A3 a2=new A3();
		
		a2.m=30;
		a2.n=40;
		a2.x1=a1;
		a2.x2=new A2();
		a2.x2.i=50;
		a2.x2.j=60;
		
		System.out.println(a2.m);
		System.out.println(a2.n);
		System.out.println();
		System.out.println(a2.x1.i);
		System.out.println(a2.x1.j);
		System.out.println();
		System.out.println(a2.x2.i);
		System.out.println(a2.x2.j);
	
	}
}
