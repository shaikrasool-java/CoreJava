package com.java.constructors;

public class O {

	O(int i){
		System.out.println("O(int i):");
	}
	public static void main(String[] args) {
		O o=new O(10);
		System.out.println("done");
	}
}
