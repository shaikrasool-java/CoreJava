package com.java.multithreading;

class mythread5 extends Thread{
	 
}
public class F {

	public static void main(String[]args){
		System.out.println(Thread.currentThread().getName());
		mythread5 mt=new mythread5();
		System.out.println(mt.getName());
		Thread.currentThread().setName("this is main class thread...");
		System.out.println(Thread.currentThread().getName());
			
		
	}
	
}



/*
 Thread class Constructors...
Thread t=new Thread();
Thread t=new Thread(Runnable r);
Thread t=new Thread(String name);
Thread t=new Thread(Runnable r, String name);
Thread t=new Thread(ThreadGroup tg, String name);
Thread t=new Thread(ThreadGroup tg, Runnable r);
Thread t=new Thread(ThreadGroup tg, Runnable r, String name);
Thread t=new Thread(ThreadGroup tg, Runnable r, String name, long stacksize);




*/