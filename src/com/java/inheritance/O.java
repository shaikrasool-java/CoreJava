package com.java.inheritance;

class Tree{
	Tree(){
		System.out.println("Tree()");
	}
	{
		System.out.println(" tree-non static block:");
	}
}
class Uber extends Tree{
	Uber(){
		System.out.println("Uber()");
	}
	{
		System.out.println("uber- non static block");
	}
}

public class O {

	public static void main(String[] args) {
		
		Tree t=new Tree();
		System.out.println();
		Uber u=new Uber();
	}
}
