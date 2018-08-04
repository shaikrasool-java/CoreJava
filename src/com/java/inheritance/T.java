package com.java.inheritance;

class Ear{
	Ear(int i){
		System.out.println("Ear(int i)");
	}
	Ear(){
		System.out.println("Ear()");
	}
}

class Free  extends Ear{
	
	Free(int i){
		System.out.println("Free(int i)");
	}
	Free(){
		System.out.println("Free()");
	}
	
}

public class T {
	public static void main(String[] args) {
		
		Free f=new Free();
		System.out.println();
		Free f1=new Free(10);
		System.out.println();
		Ear e=new Ear();
		System.out.println();
		Ear e1=new Ear(20);
	}

}
