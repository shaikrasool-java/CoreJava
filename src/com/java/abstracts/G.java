package com.java.abstracts;

abstract class High{
	
	High(){
		System.out.println("High()");
	}
}
abstract class Ink extends High{
	Ink(int i){
		System.out.println("Ink(int i)");
	}
}
public class G extends Ink{
	
	G(){
		
		super(10);
		System.out.println("G()");
	}
	public static void main(String[] args) {
		
		G g=new G();
		
	}

}
