package com.java.multithreading;

public class B {

	public static void main(String[]args){

		mythread mt=new mythread();
		
		//mt.start();
		mt.run();
		for(int i=0; i<10; i++){
			System.out.println("main thread....");
		}
	}
}
/*
************what is the difference between run() and start() methods
 in the case of start() method a new thread will be created.
 which is responsible for the execution of run() method.
 but in the case of run () method , 
 a new thread won't be created and run method will be executed 
 just like a normal method call by main thread.
 hence in the above program if we replace start() with run() 
 then the output will be first child thread executed and after that main thread will execute...

*************importance of Thread class start() method:-
Thread class start() method is responsible to register the thread with 
thread scheduler and all other mandatory activities.
hence without executing thread class start() method there is no chance of starting in java.
due to this thread class start() method is considered as heart of Multi Threading.
in there start() method run() method invokes automatically...there is no need to call separately run() method.
 

***********OVERLOADING OF run() method.*****
overloading of run() method is always possible but 
thread class start() method can invoked no argument run() method.
the other overloaded method we have to call explicitly like normal method call.


***********IF WE ARE NOT OVERRIDING RUN METHOD*******

if we are not overriding run() method then thread class run() method 
will be executed which has empty implementation. 
hence we won't get any output.
class mythread extends Thread{
}
class test{
public static void main(String[] args){
mythread mt=new mythread();
mt.start();
}
}
it is highly recomended override run() method, other wise don't go for multi threading concept.




*/
