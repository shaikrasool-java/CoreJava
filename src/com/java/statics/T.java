package com.java.statics;

public class T {

	static int i=test1()+test2();
	static int j=test2()+test1();
	
		public static int test1(){
		//System.out.println("from test-1...");
		System.out.println("a:"+i+","+j);
		i=1;
		j=2;
		System.out.println("b:"+test2());
		System.out.println("c:"+i+","+j);
		i=3;
		j=4;
		main(null);
		System.out.println("d:"+i+","+j);
		return 10;
	}
		public static int test2(){
			//System.out.println("from test-2");
			System.out.println("e:"+i+","+j);
			i=5;
			j=6;
			System.out.println("f:"+i+","+j);
			i=7;
			j=8;
			main(null);
			System.out.println("g:"+i+","+j);
			return 20;
			
		}
		public static void main(String[] args) {
			
			System.out.println("main:"+i+","+j);
			i=9;
			j=10; 
		}

}
