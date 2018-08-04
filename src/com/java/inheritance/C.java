 package com.java.inheritance;

class Java{
	int i;
	void test1(){
		System.out.println("from test1");
	}
}
class Class extends Java{
	int j;
	void test2(){
		System.out.println("from test2");
	}
}

public class C {
	
	public static void main(String[] args) {
		Class c=new Class();
		System.out.println(c.i);
		System.out.println(c.j);
		c.test1();
		c.test2();
	}

}
