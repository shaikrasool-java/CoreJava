package com.java.multithreading;

class mythread8 extends Thread{
	
	public void run(){
		 for(int i=0; i<10;i++){
			 System.out.println("child run method");
		 }
			 
	}
}


public class I {

	public static void main(String[]args){
		
		mythread8 mt=new mythread8();
		mt.setPriority(10);
		mt.start();
		
		for(int i=0; i<10;i++){
			System.out.println("main thread");
		}
		
	}
}
