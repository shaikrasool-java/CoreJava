package com.java.constructors;

public class ZA {

	ZA(){
		System.out.println("ZA()");
	}
	ZA(int i){
		this();
		System.out.println("ZA(int i)");
	}

	static {
		System.out.println("from static block I");
	}
	{
		System.out.println("from non static block I");
	}
	ZA(int i, int j){
		this();
		System.out.println("ZA(int i,int j)");
	}
	{
		System.out.println("from non static block II ");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		ZA z=new ZA(10);
		System.out.println();
		ZA z1=new ZA(10,220);
		System.out.println();
		ZA z2=new ZA();
		System.out.println("main end");
		
		
		
	}
	static	{
		System.out.println("from static block II");
	}
}
