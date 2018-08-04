package com.java.practice;

import java.util.Scanner;

public class FibonacciSeries {


	public static void main(String[] args) {
		
		int a=-1, b=1, n, c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length...");
		n=sc.nextInt();
	
		System.out.println("my value:"+n);
	for(int i=0; i<=n; i++){
	 c=a+b;
		System.out.println("c value: "+c);
		a=b;
		System.out.println("a value: "+a);
		b=c;
		System.out.println("b value: "+b);
		
		System.out.println("fibanacciSerise: "+c);
		
	}

sc.close();
}
}