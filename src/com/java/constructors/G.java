package com.java.constructors;

public class G {

	static int i;
	G(){
		i++;
	}
	public static void main(String[] args) {
		
		G g=new G();
		G g1=new G();
		G g2=new G();
		G g3=new G();
		System.out.println(g.i);
		System.out.println(g1.i);
		System.out.println(g2.i);
		System.out.println(g3.i);
	}
	
}
