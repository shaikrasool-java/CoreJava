package com.java.interfaces;

interface Lie{
	void test();
}
class Myth{
	public void test(){
		
		System.out.println("from test");
	}
}


public class H extends Myth implements Lie {

	public static void main(String[] args) {
		
		H h=new H();
		h.test();
		
		System.out.println("done");
	}
}
