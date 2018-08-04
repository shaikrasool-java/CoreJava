package com.java.multithreading;

/*
methods in mutlithreaing...
1)yield()
2)join()
3)sleep()

1)yield() method:- this method causes to pause current executing thread 
to give the chance for waiting threads are same priority, 
*if there is no waiting thread are all waiting threads have 
low priority then same thread can continue it's execution.
* if multiple threads are waiting with same priority then which waiting thread will get the chance, we can't expect 
it depends on thread scheduler.
* the thread which is yielded, when it will get the chance once again, 
it depends on thread scheduler, and we can't expect exactly...
* public static native void yield():

*/

class mythread9 extends Thread{
	
	public void run(){
		
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			Thread.yield();
		}
	}
}


public class J {
 public static void main(String[]args){
	 
	 mythread9 mt=new mythread9();
	 mt.start();
	 for(int i=0; i<10; i++){
		 System.out.println("main thread");
	 }
	 
	 
 }
}

/*in the above program commenting yield method both methods executes simultaneously we can't expect which thread will complete
 *if we not commenting yield method then child thread always calls yield method because of that main thread will get chance more no of times and the chance of completing main thread is high. 
 */
