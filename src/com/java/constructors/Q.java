package com.java.constructors;

public class Q {

	Q(){
		this(10);
		System.out.println("Q():");
	}
	Q(int i){
		System.out.println("Q(int i):");
	}
	public static void main(String[] args) {
		Q q=new Q();
		System.out.println();
		Q q1=new Q(20);
		System.out.println();
	}
}
