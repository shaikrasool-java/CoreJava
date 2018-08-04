package com.java.multithreading;

class mythread6 extends Thread{
	
	public void run(){
		System.out.println("this line is executed by:"+Thread.currentThread().getName());
					}
}

public class G {
	
	public static void main(String[]args){
		
		mythread6 mt=new mythread6();
		mt.start();
		System.out.println("this line is executed by:"+Thread.currentThread().getName());
		
	}
}
