package com.java.polymorphism;

public class OverloadingE {

	void sum(int i,int j){
		int sum=i+j;
		System.out.println("test(int i,int j)");
		System.out.println("sum:"+sum);
	}
	void sum(String i,String j){
		String sum=i+j;
		System.out.println("test(String i, String j)");
		System.out.println("sum:"+sum);
	}
	public static void main(String[] args) {
		OverloadingE oe=new OverloadingE();
		oe.sum(10, 20);
		oe.sum("shaik", " rasool");
		System.out.println("done...");
	}
}
