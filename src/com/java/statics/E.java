package com.java.statics;

public class E {

	static int i;
	//static int j=m;
	//Cannot reference a field before it is defined, here compile time error will occur
	static int m=10;
	public static void main(String[] args) {
		
		System.out.println("int i="+i);
		System.out.println("int m="+m);
	}
}
