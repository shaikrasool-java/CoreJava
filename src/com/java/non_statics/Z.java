package com.java.non_statics;

public class Z {

	int i;
	static void test(Z z){
		Z z1=new Z();
		z1.i=z.i;
		System.out.println("test -a:"+z.i);
		System.out.println("test -b:"+z1.i);
		
	}
		public static void main(String[] args) {
			
			Z z2=new Z();
			z2.i=10;
			test(z2);
		}
}
