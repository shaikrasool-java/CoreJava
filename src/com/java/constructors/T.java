package com.java.constructors;

public class T {

	T(){
		System.out.println("T():");
		
	}
	{
		System.out.println("from non static block");
	}
	public static void main(String[] args) {
		T t=new T();
		System.out.println("----------");
		T t1=new T();
	
	}
}
