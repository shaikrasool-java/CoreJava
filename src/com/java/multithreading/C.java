package com.java.multithreading;
//*****OVERRIDING OF start() Method**********
class mythread2 extends Thread{
public void start(){
System.out.println("start method");
}
public void run(){
System.out.println("run method");
}
}
class test{ 
public static void main(String[] args){
mythread2 mt=new mythread2();
mt.start();
System.out.println("main thread");
}
}
/*
if we override start() method then our start() will be execute just like a normal method call and 
new thread won't be created example code available for these above program.
NOTE; it is not recommended to override start() method other wise don't go for multi threading concept.



*/