package com.java.constructors;

public class S {
	S(){
		System.out.println("S():");
		//this(10);
		//declare "this" statement is the first statement, 
		// other wise compile time error will be occur
	}
	S(int i){
		System.out.println("S(int i):");
	}
	public static void main(String[] args) {
		S s=new S();
		S s1=new S(10);
	}

}
