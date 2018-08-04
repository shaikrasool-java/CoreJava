package com.java.inheritance;

class Cat{
	Cat(){
		System.out.println("Cat()");
	}
	{
		System.out.println("Cat non static block...");
	}
	static{
		System.out.println("Cat static-block...");
	}
}
 class Dell extends Cat{
	 Dell(){
		 System.out.println("Dell()");
	 }
	 {
		 System.out.println("Dell non static block");
	 }
	 static{
		 System.out.println("Dell static block");
	 }
	 Dell(int i){
		 this();
		 System.out.println("Dell(int i)");
	 }
 }

public class S {
	
	public static void main(String[] args) {
		
		Dell d=new Dell();
		System.out.println();
		Cat c=new Cat();
		System.out.println();
		Dell d1=new Dell(10);
		
		
	}
	static{
		
	}
}
