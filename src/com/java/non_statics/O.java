package com.java.non_statics;

public class O {

	public static void main(String[] args) {
		
		O o1=new O();
		O o2=new O();
		O o3=o2;
		O o4=o1;
		O o5=o3;
		O o6=o5;
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1==o2);
		System.out.println();
		
		
		System.out.println(o3);
		System.out.println(o4);
		System.out.println(o3==o4);
		
		
		System.out.println(o5);
		System.out.println(o6);
		System.out.println(o5==o6);
		
	}
}
