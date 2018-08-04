package com.java.polymorphism;

abstract class A{
	abstract void test();
}
public class OverridingA extends A{
void test() {

	System.out.println("from test");
}
public static void main(String[] args) {
	OverridingA oa=new OverridingA();
	oa.test();
}
}
