package com.java.practice;

import java.util.Scanner;

public class PrimeNumber_OR_NOT {

	public static void main(String[] args) {
		
	int num, temp;
	boolean isPrime=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number: ");
	num=sc.nextInt();
	sc.close();
	for(int i=2; i<=num/2; i++){
		
		temp=num%i;
		if(temp==0){
			isPrime=false;
			break;
		}
	}
	if(isPrime){
		System.out.println("number is prime: "+num);
	}
	else{
		System.out.println("number is not prime: "+num);
	}
	
	
	
	}
}
