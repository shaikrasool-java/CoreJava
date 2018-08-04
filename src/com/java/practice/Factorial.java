package com.java.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		/*int n=6;
		int factorial=n;
		*/
		int n, factorial;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		factorial=n;
		
		
		for(int i=(n-1); i>1; i--){
			factorial=factorial*i;
			System.out.println("number "+i);
			System.out.println("....: "+factorial);
		}
		System.out.println("factorial= "+factorial);
	sc.close();	
	}
}
