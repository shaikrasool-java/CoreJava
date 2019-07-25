package com.java.practice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		String str, rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the string...");
		str=sc.nextLine();
		int i=str.length();
		
		for(int j=i-1; j>=0;--j){
			rev=rev+str.charAt(j);
			System.out.println("revers string: "+ rev);
		}
		if(str.equals(rev)){
			System.out.println("output string is: "+str+"||"+rev);
			System.out.println("given string is palindrome");
		}
		else{
			System.out.println("given string: "+str+"||"+rev);
			System.out.println("givenn string is not palindrome");
		}
		
	}
}
