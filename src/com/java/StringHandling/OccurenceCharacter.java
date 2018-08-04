package com.java.StringHandling;

import java.io.IOException;
import java.util.Scanner;

public class OccurenceCharacter {

	public static void main(String[]args)throws IOException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		int count=0, length=0;
		do{
			try{
				char name[]=s.toCharArray();
				length=name.length;
				count=0;
				for(int i=0;i<=length;i++){
					
					if((name[0]==name[i])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123)))count++;
				}
						if(count!=0){
							System.out.println(name[0]+" "+count+" times");
						}
						s=s.replace("",+name[0]+"");
			}catch(Exception e){
				System.out.println(e);
			}
			
		}
		while(length!=1);
	}
}
