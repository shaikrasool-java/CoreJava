package com.java.constructors;

class Address{
	String hno;
	String streetname;
	
}
class Person{
	String name;
	int age;
	double weight;
	Address parmanentAddress;
	
	void personinfo(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("weight:"+weight);
		System.out.println("parmanentAddress:"+"hno:"+parmanentAddress.hno+","+"street:"+parmanentAddress.streetname);
		System.out.println();
	}
	
}
public class ZH {

	public static void main(String[] args) {
		Address a1=new Address();
		a1.hno="9-99";
		a1.streetname="raja street";
		Person p=new Person();
		p.name="Rasool";
		p.age=25;
		p.weight=57.50;
		p.parmanentAddress=a1;
		
		Person pa=new Person();
		pa.name="Basheer";
		pa.age=40;
		pa.weight=72;
		pa.parmanentAddress=new Address();
		pa.parmanentAddress.hno="9/99";
		pa.parmanentAddress.streetname="Raja street";
		pa.personinfo();
		p.personinfo();
	}
}
