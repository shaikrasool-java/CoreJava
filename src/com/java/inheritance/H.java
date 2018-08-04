package com.java.inheritance;
class Ball{
	static int i;
	static {
		System.out.println("Ball-static block:"+i);
	}
}
class Car extends Ball{
	static int j;
	static {
		System.out.println("Car-static block:"+j);
	}
}

public class H {
	
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(Car.j);
	}

}
