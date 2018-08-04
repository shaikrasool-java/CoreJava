package com.java.inheritance;
 class King extends Object{
	 King(){
		 super();
		 System.out.println("King():");
	 }
 }
 class Loin extends King{
	 Loin(){
		 super();
		 System.out.println("Lion():");
	 }
 }
public class K {
	public static void main(String[] args) {
		King k=new King();
		System.out.println();
		Loin l=new Loin();
	}

}
