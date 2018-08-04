package com.java.multithreading;

class mythread11 extends Thread{
	
	static Thread mt;
	public void run(){
		
		try {
			mt.join();
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}
		
		for(int i=0; i<10; i++){
			System.out.println("child thread...");
		}
	}
	
}

public class L {
	public static void main(String[]args) throws InterruptedException{
		
		
		mythread11.mt=Thread.currentThread();
		mythread11 m=new mythread11();
		m.start();
		for(int i=0; i<10; i++){
			System.out.println("main thread...");
			Thread.sleep(2000);
		}
		
		
	}
}

/*
 * above example child thread calls join() method on main thread object hence child thread has to wait 
 * until compeliting main thread, in this case the out is main thread is followed by child thread.
 */

/*

if a thread calls join() method on the same thread it self, then the program will be stuck.(something like dead lock)
in this case thread has to wait infinite amount of time  
Ex:-
class Test{
public static void main(String[]args) throws InterrputedException {
 Thread.currentThread().join();
}
}
*/