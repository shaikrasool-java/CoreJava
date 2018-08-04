package com.java.polymorphism;

public class OverloadingA {

	public static void main(String[] args) {
		System.out.println("String[] args");
	}
	public void main(String args){
		System.out.println("String args");
	}
	public int main(){
		System.out.println("main()");
		return 10;
	}
}
