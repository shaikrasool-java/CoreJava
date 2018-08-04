package com.java.multithreading;
/*
 * Synchronization:
 * synchronized is a modifier applicable only for method and blocks but nor for classes and variables...
 * if multiple threads are trying to operate simultaneously on the same java object, then there may be- 
   -a chance of data inconstancy problem
 * to overcome this problem we should go for synchronized keyword
 * if a method or block declared as synchronized then at a time only one thread is allow to execute-
   -that method or block on the given object.
 * so that data inconsistency problem will be resolved.
 * the main advantage of synchronized keyword is:- we can resolve data inconsistency problems but 
 * the main disadvantage of synchronized keyword is:- it increases waiting time of thread and creates 
   -performance problem hence if there 
 * is no specific requirement then its recommended to use synchronized keyword. 

internally synchronization is implemented by using lock, every object in java has a unique lock.
when ever we are using synchronized keyword then only lock concept will coming to the picture.
*if a thread wants to execute synchronized method on the given object first it has to get lock of the object.
*once thread get the lock then it is allowed to execute any synchronized method on that object.
*once method execution completes automatically thread releases the lock.
*Acquiring and releasing internally takes care by JVM and programmer not responsible for this activity

*/

class Display{
	
	
	public synchronized void wish(String name){
		
		
		for(int i=0; i<10; i++){
			System.out.println("Good Morning: "+name);
		
		try{
			Thread.sleep(2500);
		}
		catch(InterruptedException ie){
			System.out.println(name);
		}
		
		}
		
	}
	
}


class Mythread14 extends Thread{
	
	Display d;
	String name;
	Mythread14(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
	
}

public class O {

	public static void main(String[]args){
		
		Display d=new Display();
		Mythread14 mt1=new Mythread14(d, "cr7");
		Mythread14 mt2=new Mythread14(d,"messi");
		mt1.start();
		mt2.start();
		
	}
}
