package com.java.constructors;


class Z1{
	int i;
}
class Z2{
	int j;
	Z1 b1;
	Z2(int i,int j){
		this.j=j;
		this.b1=b1;
	}
	void printinfo(){
		System.out.println("j"+j);
		System.out.println(b1.i);
	}
	
}
public class ZI {
public static void main(String[] args) {
	
	Z1 z1=new Z1();
	z1.i=10;
	System.out.println();
	Z2 z2=new Z2(20,z1.i);
	Z1 z3=new Z1();
	Z2 z4=new Z2(40,z2.j);
	z2.printinfo();
	z4.printinfo();
	
}
	
}
