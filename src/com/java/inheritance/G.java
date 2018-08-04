package com.java.inheritance;

class Atest01{
	int i;
}
class Btest{
	Atest01 a=new Atest01();
	void test01(){
		System.out.println("from test:"+a.i);
	}
}
public class G {
public static void main(String[] args) {
	

	Btest b=new Btest();
	b.test01();
}
}