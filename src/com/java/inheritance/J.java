package com.java.inheritance;
class Gate{
	static int i;
	static {
		System.out.println("Gate static block...");
	}
}

class Hat extends Gate{
	static int j;
	static {
		System.out.println("hat static block...");
	}
}
class Ice extends Hat{
	static int k;
	static{
		System.out.println("Ice static block...");
	}
}
class Jeep extends Ice{
	static int l;
	static{
		System.out.println("Jeep static block...");
	}
}
public class J {
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(Jeep.l);
		System.out.println("main end");
	}

}
