package com.java.interfaces;

interface Crack{
	void test1();
}
interface Drunk extends Crack{
	void test2();
}
interface Ema extends Drunk{
	void test3();
}

public class N implements Ema{

public void test1(){
	System.out.println("from test1");
}
public void test2(){
	System.out.println("from test2");
	
}
public void test3(){
	System.out.println("from test3");
}
	public static void main(String[] args) {
		N n=new N();
		n.test1();
		n.test2();
		n.test3();
	}

}
