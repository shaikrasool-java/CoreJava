package com.java.statics;

public class D {
	//static int i=j;
	//here compile time error will be occur"Unresolved compilation problem:"
	//Cannot reference a field before it is defined
	static int j=10;
	public static void main(String[] args) {
		//System.out.println("int i="+i);
		System.out.println("int j="+j);
	}

}
