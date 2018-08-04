package com.java.non_statics;

public class Z2 {

	int i;
	static void test1(Z2 a,Z2 b){
		
		int x=a.i;
		a.i=b.i;
		b.i=x;
		
	}
	void test2(Z2 a){
		
		int x=a.i;
		a.i=this.i;
		this.i=x;
		
	}
		public static void main(String[] args) {
			Z2 A=new Z2(), B=new Z2();
			
			A.i=1;
			B.i=2;
			test1(A,B);
			System.out.println(A.i+","+B.i);
			A.test2(B);
			System.out.println(A.i+","+B.i);
		}
}
