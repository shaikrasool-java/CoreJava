package com.java.inheritance;

 class Young{
	 Young(){
		 System.out.println("Young()");
	 }
	 {
		 System.out.println("Young static block...");
	 }
 }
 class Zebra{
	 Zebra(){
		 super();
		 System.out.println("Zebra()");
		 
	 }
	 Zebra(int i){
		 this();
		 System.out.println("Zebra(int i)");
	 }
	 
	 {
		 System.out.println("Zebra non static block...");
	 }
 }
 

public class Q {

	public static void main(String[] args) {
		Young y=new Young();
		System.out.println();
		Zebra z1=new Zebra();
		System.out.println();
		Zebra z=new Zebra(10);
		
		
	}
	
}
