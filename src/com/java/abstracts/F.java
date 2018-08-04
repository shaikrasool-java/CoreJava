package com.java.abstracts;

abstract class Gate{
	Gate(){
		
		System.out.println("Gate()");
	}
}

public class F extends Gate
{
	F(){
		
		System.out.println("from class F");
	}
	public static void main(String[] args) {
		
		F f=new F();
		
	}

}
