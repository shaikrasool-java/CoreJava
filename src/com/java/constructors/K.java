package com.java.constructors;

public class K {

	K(){
		System.out.println("K():");
	}
	K(int i){
		System.out.println("K(int i):");
		
	}
	K(int i, int j){
		System.out.println("K(int i, int j)");
	}
	public static void main(String[] args) {
		
		K obj=new K();
		System.out.println();
		System.out.println();
		
		K ob=new K(10);
		System.out.println();
		System.out.println();
		
		K o=new K(10,20);
		System.out.println();
		System.out.println();
	}
	
}
