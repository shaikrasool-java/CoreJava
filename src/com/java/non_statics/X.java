package com.java.non_statics;

public class X {

	int i;
	void test1(){
		i=1;
	}
	static void test2(X obj){
		System.out.println("a:"+obj.i);
		obj.test1();
		System.out.println("b:"+obj.i);
		
	}
	void test3(){
		System.out.println("c:"+this.i);
		test1();
		System.out.println("d:"+this.i);
		
	}
	
		public static void main(String[] args) {
			
			X x=new X();
			x.test1();
			System.out.println("e:"+x.i);
			x.i=2;
			test2(x);
			System.out.println("f:"+x.i);
			
			x.i=3;
			x.test3();
			System.out.println("g:"+x.i);
		}
}
