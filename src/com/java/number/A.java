package com.java.number;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		 
		int num=sc.nextInt();
		int count=0;
		int i=num;
		while(i!=0){
			count++;
			i=i/10;
			
		}
		int div=1;
		for(int j=1; j<count;j++){
			div*=10;
		}
	
		int firstDigit=num/div;
		if(firstDigit%2==0){
			System.out.println(firstDigit+"=is even number");
		}
		else{
			System.out.println(firstDigit+"=is odd number");
		}
		
	
	}
	
}
