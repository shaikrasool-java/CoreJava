package com.java.constructors;

public class V {

	V(){
		System.out.println("V():");
	}
	V(int i)
	{
	System.out.println("V(int i):");	
	}
	{
		System.out.println("from instance block");
	}
	public static void main(String[] args) {
			
		V v=new V();
		System.out.println("---------");
		V v1=new V(10);
		System.out.println("-------------");
		
	}
}
