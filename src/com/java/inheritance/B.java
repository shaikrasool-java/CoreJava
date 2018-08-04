package com.java.inheritance;

class Testing{
	void test1(){
		System.out.println("from testing");
	}
}
class Tester extends Testing{
	void test2(){
		test1();
		System.out.println("from tester");
	}
}

public class B {
	public static void main(String[] args) {
		Tester t=new Tester();
		t.test1();
		t.test2();
		//t.toString();
	}

}
