package com.java.inheritance;

class Ant{
	Ant(){
		System.out.println("Ant()");
	}
	{
		System.out.println("Ant non-static block");
	}
	static{
		System.out.println("Ant static-block");
	}
}

class Book extends Ant{
	Book(){
		System.out.println("Book()");
	}
	{
		System.out.println("Book non static block");
		
	}
	static {
		System.out.println("Book static-block");
	}
	Book(int i){
		this();
		System.out.println("Book(int i)");
	}
}
public class R {

	public static void main(String[] args) {
		
		Ant a=new Ant();
		System.out.println();
		Book b=new Book();
		System.out.println();
		Book b1=new Book(10);
	}
	static{
		System.out.println("R-static block");
	}
}
