package com.java.non_statics;

public class U {

	int i;
	void test(){
		
		i=10;
		
	}
	public static void main(String[] args) {
		
		U u=new U();
		System.out.println("from class variable default value:"+u.i);
		u.test();
		System.out.println("from method varible assigned value:"+u.i);
		
		U u1=new U();
		System.out.println("from where:"+u1.i);
		u1.test();
		System.out.println("from where:"+u1.i);
	}

}
