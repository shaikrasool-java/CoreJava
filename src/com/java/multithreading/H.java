package com.java.multithreading;
class mythread7 extends Thread{

}

public class H{
	public static void main(String[]args){

		System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(8);
//	System.out.println(Thread.currentThread().getPriority());
	mythread7 mt=new mythread7();
	System.out.println(mt.getPriority());

}

}

/*
 * thread priorities
 * 1)public final int getPriority();
 * 2)public final int setPriority(int n);
 allowed values range(1-10) otherwise...runtime exception: illegal argument exception.
 n.set(9)- valid
 n.set(11)- invalid
 
 the default priority only for the main thread is'5' 
 but for all remaining threads default priority will be inherited from parent to child
 that is what ever priority parent thread has the same priority will be there for the child thread.
 */




