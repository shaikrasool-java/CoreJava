package com.java.interfaces;

interface Rar{
	void test1();
}

interface Shoot extends Rar{
	void test2();
	}
interface Travel{
	void test3();
}
interface Unknown extends Travel{
	void  test4();
}
interface Van{
	void test5();
}
abstract class Won{
	abstract void test6();
	void test7(){
		System.out.println("from test 7");
	}
}
public class K extends Won implements Unknown,Van{
	
	 
	public void test1(){
		System.out.println("from test-1");
	}
	public void test2(){
		System.out.println("from test-2");
	}
	public void test3(){
		System.out.println("from test-3");
	}
	public void test4(){
		System.out.println("from test-4");
	}
	public void test5(){
		System.out.println("from test-5");
	}
	void test6(){
		System.out.println("from test-6");
	}
	public static void main(String[] args) {
		K k=new K();
		k.test1();
		k.test2();
		k.test3();
		k.test4();
		k.test5();
		k.test6();
		k.test7();
	}
}
