package com.java.interfaces;

interface Honey{
	void test1();
}
interface Imp{
	void test2();
}
interface Jump{
	void test3();
}
interface Kite extends Honey, Imp,Jump{
	void test4();
}

public class G {

	public void test1(){
		System.out.println("from test-1");
		
	}
	
	public void test2(){
		this.test1();
		System.out.println("from test-2");
	}
	public void test3(){
		this.test2();
		System.out.println("from test-3");
	}
	public void test4(){
		this.test3();
		System.out.println("from test-4");
	}
	public static void main(String[] args) {
		
		System.out.println("main begin");
		G g=new G();
		/*g.test1();
		g.test2();
		g.test3();
		*/g.test4();
		System.out.println("main end");
	}
}
