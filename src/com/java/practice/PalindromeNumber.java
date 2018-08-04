package com.java.practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int r, sum=0, temp;
		int n=141;
		temp=n;
		while(n>0){
			System.out.println("while condition");
			r=n%10;
			System.out.println("remainder :"+r);
			sum=(sum*10)+r;
			System.out.println("sum of total num: "+sum);
			
			n=n/10;
			System.out.println("n of the number: "+n);
			
		}
		
		
		
		//using for loop
		for(  ;n!=0; n/=10){
		System.out.println("for loop");
					r=n%10;
					sum=sum*10+r;
					
		}
			if(temp==sum){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}

