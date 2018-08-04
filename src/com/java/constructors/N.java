package com.java.constructors;

public class N {

	static int i;
	N(){
		i++;
		System.out.println("N():");
	}
	N(int j){
		i++;
		System.out.println("N(int i):");
	}
	public static void main(String[] args) {
		 N n1=new N();
		 System.out.println("------------------------");
		 N n2=new N(10);
		 System.out.println("-------------------------");
		 N n3=new N(20);
		 System.out.println(i);
	} 
}
