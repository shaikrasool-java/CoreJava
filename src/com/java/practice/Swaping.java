package com.java.practice;

public class Swaping {

	public static void main(String[] args) {
		
		int a=10, b=5;
		
		System.out.println("a="+a+"  b="+b);
		a=(a+b)-(b=a);
		//a=(10+5)-(5=10);// here b assing the value a;
		//a=15-10;
		//a=5
		System.out.println("a="+a+"  b="+b);
		
	}
}
