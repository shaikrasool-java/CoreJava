package com.java.multithreading;
// with=out synchronization

class myThread13{
	
 void addNew(int i){
		Thread t=Thread.currentThread();
		
		for(int i1=0; i1<5; i1++){
			System.out.println(t.getName()+"-"+(i+i1));
		}
	}
}


class My extends Thread{
	
	myThread13 mt=new myThread13();
	public void run(){
		mt.addNew(100);
	}
	
}

public class P {

	public static void main(String[]args){
		 My m=new My();
		 
		 Thread t1=new Thread(m);
		 Thread t2=new Thread(m);
		 
		 t1.setName("T1");
		 t2.setName("T2");
		 
		 t1.start();
		 t2.start();
		 
		 
		 
	}
	
	
}
