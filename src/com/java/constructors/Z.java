package com.java.constructors;

public class Z {

	Z()
	{
		System.out.println("Z()");
	}
	Z(int i)
	{
		this();
		System.out.println("Z(int i)");
	}
	Z(int i, int j){
		this(i);
		System.out.println("Z(int i,int j)");
	}
	{
		System.out.println("from instance block I");
	}
	{
		System.out.println("from instance block II");
	}
	
	public static void main(String[] args) {
		Z z1=new Z();
		System.out.println();
		Z z2=new Z(10);
		System.out.println();
		Z z3=new Z(20,32);
		
	}
}
