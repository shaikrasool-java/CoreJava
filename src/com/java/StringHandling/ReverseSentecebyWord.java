package com.java.StringHandling;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseSentecebyWord {
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(s, " ");
		
		String str="";
		
		try{
			while(st.hasMoreTokens()){
				str=st.nextToken()+" "+str;
				
			}
			System.out.println("reversed string word is:"+str);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
