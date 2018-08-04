package com.java.multithreading;
//*****OVERRIDING OF start() Method by using super keyword**********
class mythread4 extends Thread{
public void start(){
super.start();
System.out.println("start method");
}
public void run(){
System.out.println("run method");
}
}
class D{ 
public static void main(String[] args){
mythread4 mt=new mythread4();
mt.start();
System.out.println("main thread");
}
}