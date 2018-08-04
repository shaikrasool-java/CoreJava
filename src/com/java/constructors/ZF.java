package com.java.constructors;

class A1 {

	int i;
	
}
class B1{
	int j;
	A obj;
}
public class ZF{
	public static void main(String[] args) {
		A1 a=new A1();
		a.i=10;
		System.out.println(a.i);
		B1 b=new B1();
		b.j=20;
		
		System.out.println(b.j);
		System.out.println(b.obj);
	}
}

