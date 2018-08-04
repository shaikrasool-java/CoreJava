package com.java.multithreading;

/*
 ****how a thread can interrupt another thread.
 * 
 * a thread can interrupt a sleeping thread by using interrupt method of thread class
 * public void interrupt(){
 * }
 * 
 * 
 * 
 */
class myThread12 extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
			
			try{
				System.out.println("I'm lazy thread...u no");
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("I got Interrputed...");
			}
		}
	}
}
public class N {
	public static void main(String[]args)throws InterruptedException{
		myThread12 mt=new myThread12();
		mt.start();
		mt.interrupt();
		System.out.println("thread ended...");
	}

}
