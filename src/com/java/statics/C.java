
package com.java.statics;

public class C {

	static int i;
	static int j=i;
	static int k=10;
	static int l=i+j+k+20;
	public static void main(String[] args) {
		System.out.println("int i="+i);
		System.out.println("int j="+j);
		System.out.println("int k="+k);
		System.out.println("int l="+l);
	}
}
