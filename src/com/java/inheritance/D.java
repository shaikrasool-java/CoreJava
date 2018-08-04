package com.java.inheritance;

class A01{
	
	int i;
}
public class D extends A01{
	int j;
	void printdat(){
		System.out.println("i="+i+","+"j= "+j);
	}

	public static void main(String[] args) {
		D d=new D();
		d.printdat();
	}
}



