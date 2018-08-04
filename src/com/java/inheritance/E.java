package com.java.inheritance;
class A02{
	int i;
	static int j;
	void test1(){
		System.out.println("from A02 test-1");
	}
	static void test2(){
		System.out.println("from A02 test-2");
	}
}

class A03 extends A02{
	int m;
	static int n;
	void test3(){
		test1();
		System.out.println("from A03 test-3");
		test1();
	}
	static void test4(){
		test2();
		System.out.println("from A03 test-4");
	}
	void test5(){
		System.out.println("from A03 test-5");
		System.out.println(i+",");
		System.out.println(j+",");
		System.out.println(m+",");
		System.out.println(n+",");
	}
}

 public class E{
public static void main(String[] args) {
	
	A03 a=new A03();
	System.out.println(a.i);
	System.out.println(a.j);
	a.test1();
	a.test2();
	a.test3();
	a.test4();
	a.test5();
	System.out.println(A03.j);
	System.out.println(A03.n);
}
}
