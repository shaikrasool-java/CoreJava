package com.java.inheritance;
class Atest{
	int i;
	
}
public class F extends Atest{

	void test(){
		System.out.println("from test():"+i);
	}
	public static void main(String[] args) {
		 F f=new F();
		 f.test();
	}
}
