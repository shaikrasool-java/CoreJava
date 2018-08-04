package com.java.number;

import java.util.Scanner;

public class B {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int count=0;
		int i=num;
		while(i!=0){
			count++;
			i=i/10;
		}
		int div=1;
		for(int j=1;j<count;j++){
			div*=10;
			
		}
		
		int firstDigit=num/div;
		boolean flag=true;
		for(int k=2; k<=firstDigit/2;k++){
			if(firstDigit%k==0){
				flag=false;
				break;
			}
		}
		
		if(flag){
			System.out.println(firstDigit+"is a prime");
		}
		else{
			System.out.println(firstDigit+"is not prime");
		}
	}
}
