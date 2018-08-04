package com.java.inheritance;
class Pot{
	Pot(){
		System.out.println("pot()");
	}
}
class Queen extends Pot{
	Queen(){
		System.out.println("Queen()");
	}
	Queen(int i){
		this();
		System.out.println("Queen(int i)");
	}
}


public class M {

	public static void main(String[] args) {
		Pot p=new Pot();
		System.out.println();
		Queen q=new Queen();
		System.out.println();
		Queen q1=new Queen(10);
		System.out.println();
		Pot p1=new Pot();
		
	}
}
