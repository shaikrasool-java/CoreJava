package com.java.inheritance;
class Dog{
	static int i;
	static {
		System.out.println("Dog-static block");
	}
}

class Elephant extends Dog{
	static int j;
	static {
		System.out.println("elephant-static block");
	}
}
class Flag extends Elephant{
	
	static int k;
	static {
		System.out.println("flag-static block");
	}
}
 
public class I {
static{
	System.out.println("main-static block");
}
public static void main(String[] args) {
	System.out.println("main begin");
	System.out.println("int i="+Dog.i+",int j="+Elephant.j+",int k="+Flag.k);
	System.out.println("main end");
}

}

