package com.java.StringHandling;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SeparatingWords {

	public static void main(String[]args){
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()){
			System.out.println("remaining are: "+st.countTokens());
			System.out.println(st.nextToken());
		}
	}
}
