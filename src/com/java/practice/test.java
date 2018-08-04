package com.java.practice;

public class test implements Cloneable {
	public String name;
	public int age;
	public test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) throws CloneNotSupportedException {

		test t1=new test("rasool", 23);
		System.out.println("name="+t1.getName());
		System.out.println("Age="+t1.getAge());

		System.out.println();
		test t2=(test)t1.clone();
		System.out.println("name="+t2.getName());
		System.out.println("Age="+t2.getAge());

	} 	


}
