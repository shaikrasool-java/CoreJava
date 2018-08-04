package com.java.multithreading;

class myRunnable implements Runnable{
	 public void run(){
		 for(int i=0;i<10;i++){
			 System.out.println("child thread...");
		 }
	 }
}

public class E{
	
	public static void main(String[]args){
		 
		myRunnable r=new myRunnable();
				
		Thread t=new Thread();
		
		Thread t1=new Thread(r);

/*	
 * case1: t1.start();
 * a thread will be created which is responsible for the execution of thread class run() method,
 * which has empty implementation.
 * 
 * case2:t1.run();
 * NO new thread will create , and thread class run() will be executed just like a normal method call.
 * 
 * case3: t2.start();
 * 
 * a new thread will be created which is responsible for the execution of myRunnable class run() method.
 * 
 * case4:t2.run();
 * a new thread won't be created under myRunnable run method will be executed just like a normal method call.
 * 
 * case5:r.start();
 * we will get compile time error...	
 * error is: my Runnable class doesn't have start() capability...location class myRunnable
 * 
 * case 6:r.run();
 * no new thread will create, and my Runnable run() method will be executed like normal method call...
 * 
 * 
 * 
		
		
		
*/		
		
		t.start();
		
		//r.start();
		
		for(int i=0;i<10;i++){
			System.out.println("parent thread...");
		}
		
		
	}

}
