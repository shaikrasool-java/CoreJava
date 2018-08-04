package com.java.inheritance;

class Ring{
	Ring(){
		System.out.println("Ring():");
	}
}
class Sun extends Ring{
	Sun(){
		
		System.out.println("Sun():");
	}
	Sun(int i){
		this();
		System.out.println("Sun(int i):");
	}
	Sun(int i,int j){
		this(i);
		System.out.println("Sun(int i,int J):");
	}
}

public class N {

	public static void main(String[] args) {
		Ring r=new Ring();
		System.out.println();
		Sun s=new Sun();
		System.out.println();
		Sun s1=new Sun(10);
		System.out.println();
		Sun s2=new Sun(10,20);
		
	}
}
