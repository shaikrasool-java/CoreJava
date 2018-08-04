package com.java.multithreading;

class mythread extends Thread{
	

	
	public void run(){
		
		for(int i=0; i<3; i++){
			System.out.println("this is child thread...");
		}
	}
	public  void run(int i){
		for(int k=0; k<3; k++){
			System.out.println("child thread with argument");
		}
	
	 
			 }
	
	
}
// above code will executed by child thread in main class
public class A {

	public static void main(String[]args){
		
		mythread mt=new mythread();
		// thread is instantiated
		
		mt.start();
	//mt.run();
		// starting of a thread...
		
		for(int j=0; j<3; j++){
			System.out.println("this is main thread...");
		}
		
	}
}

/*
1)Thread Scheduler...
 it is the part of JVM , it is responsible to schedule threads that is if multiple threads waiting to get the 
 chance of execution, then in which order threads will be executed is decided by thread scheduler...
 we can't except exact algorithm by followed by Thread Scheduler it is wearied from JVM to JVM 
hence we can't except thread execution order and exact output
hence when ever situation come to multi-threading there is no guaranty but we can provide several possible outputs
 



*/