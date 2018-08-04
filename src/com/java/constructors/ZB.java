package com.java.constructors;

public class ZB {
	 
	int i;
	ZB(int i){
		this.i=i;
		System.out.println("Q(int i)");
	}
	public static void main(String[] args) {
		ZB z=new ZB(450000000);
		System.out.println(z.i);
		ZB za=new ZB(10);
		System.out.println(za.i);
	}

	 
}
