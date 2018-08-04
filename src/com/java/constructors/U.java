package com.java.constructors;

public class U {

	U(){
		System.out.println("U():");
	}
	{
		System.out.println("from instance block I");
	}
	public static void main(String[] args) {
		 U u=new U();
		 System.out.println("------------");
		 U u1=new U();
		 System.out.println("------------");
	
	}
	{
		System.out.println("from instance block II");
	}
}

