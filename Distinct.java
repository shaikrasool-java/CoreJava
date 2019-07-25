package com.java.practice;

public class Distinct {

	public static void distinctElement(int[]arr){
		for(int i=0; i<arr.length; i++){
			boolean isDistinct=false;
			for(int j=0; j<i;j++){
				if(arr[i]==arr[j]){
					isDistinct=true;
					break;
				}
			}
			if(!isDistinct){
				System.out.print(arr[i]+",");
			}
		}
	}
	public static void main(String[] args) { 
		int []n={1,2,3,1,5,2,9,5,3,4,5,4,5,1,2,8};
		Distinct.distinctElement(n);
	}
}
