package com.java.inheritance;

class Van{
	Van(){
		System.out.println("Van()");
	}
	{
		System.out.println("Van-non-static block");
	}
}
class Wax extends Van{
	Wax(){
		System.out.println("Wax()");
	}
	{
		System.out.println("Wax-non-static block");
	}
	}
	class Xmas extends Wax{
		Xmas(){
			System.out.println("Xmas()");
			
		}
		{
			System.out.println("Xmas-non static block");
		}
	}


public class P {

	public static void main(String[] args) {
		
		new Van();
		new Wax();
		new Xmas();
		
		
	}
}
