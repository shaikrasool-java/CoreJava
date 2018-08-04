package com.java.constructors;

public class ZE {

	String name;
	int age;
	double weight;
	ZE(String name,int age, double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	void printlninfo()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("weight:"+weight);
		
	}
	public static void main(String[] args) {
		ZE z1=new ZE("shaik",24,55.00);
		ZE z2=new ZE("nabi",25,56.00);
		ZE z3=new ZE("rasool",26,56.55);
		z1.printlninfo();
		System.out.println();
		z2.printlninfo();
		System.out.println();
		z3.printlninfo();
		
	}
	
}
