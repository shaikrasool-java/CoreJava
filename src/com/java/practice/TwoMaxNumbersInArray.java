package com.java.practice;

public class TwoMaxNumbersInArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,80,94,89};
		int temp;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("two max numbers are "+arr[0]+" and "+arr[1]);
	}
}
