package com.java.polymorphism;

public class OverloadingD {

	int test(){
		System.out.println("test():int");
	return 10;
	}
	/*double test(){
		System.out.println("test():double");
		return 10.0;
	}
	=> here two same name methods with different data types are not allowed in a same class
	*/
	public static void main(String[] args) {
		
		OverloadingD od=new OverloadingD();
		od.test();
			}
	
}
