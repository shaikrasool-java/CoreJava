package com.java.constructors;

public class I {

	int i;
	I(){
		i++;
	}
	
	public static void main(String[] args) {
		I a=new I();
		System.out.println(a.i);
		I b=new I();
		System.out.println(b.i);
		I c=new I();
		System.out.println(c.i);
		
	}
}
