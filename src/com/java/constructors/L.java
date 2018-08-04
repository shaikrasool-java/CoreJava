package com.java.constructors;

public class L {

	L(int i){
		System.out.println("L(int i):");
	}
	/*L(int j){
		System.out.println("L(int j):");
	}
	here duplicate constructor not allowed in same class... 
	if we try den compile time error will be occur
	*/
	public static void main(String[] args) {
		L l=new L(10);
		System.out.println("done");
	}
}
