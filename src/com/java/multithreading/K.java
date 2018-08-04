package com.java.multithreading;
/*
2) join():
if a thread want's to wait until to complete some other thread then we should go for join() method,
ex:- if a thread t1 wants to wait until complete t2 then t1 has call t2.join
if t1 executes t2.join then immediately t1 will be entered into waiting state until t2 completes,
once t2 completes then t1 can continue it's execution.

*/

class mythread10 extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread.");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ie){
			
		}
		}
		
	}
}

public class K {

	public static void main(String[]args) throws InterruptedException{
		
		mythread10 mt=new mythread10();
		mt.start();
		mt.join(10000);
		
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}
}
