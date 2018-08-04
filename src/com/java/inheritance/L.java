package com.java.inheritance;
class Man{
	Man(){
		System.out.println("Man()");
	}
}
class Nurse extends Man{
	Nurse(){
		System.out.println("Nurse()");
	}
}
class Ox extends Nurse{
	Ox(){
		System.out.println("Ox()");
	}
}
public class L {
public static void main(String[] args) {
	new Man();
	System.out.println();
	new Nurse();
	System.out.println();
	new Ox();
	
	
}
}
