package com.java.simple;

interface calculate{
	
	void cal(int item);
}
 

class display implements calculate{

	int x;
	public void  cal(int item) {
		x=item*item;
	}
}

public class A{
	public static void main(String[] args) {
		
		display arr=new display();
		arr.x=0;
		arr.cal(2);
		System.out.println(arr.x);
	}
	
}