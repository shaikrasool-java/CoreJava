package com.java.inheritance;

class  Get{ 
	Get(int i,int j){
		System.out.println("Get(int i,int j)");
	}
	
}




public class U extends Get{

		U(){
			super(10,20);
			System.out.println("U()");
		}
	
	public static void main(String[] args) {
		
		System.out.println("hello java");
		U u=new U();

	}

}
