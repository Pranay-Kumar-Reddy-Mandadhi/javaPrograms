package com.oopspractice;
class A2{
	String name;
	int age;
	public A2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public A2(int age) {
		this.age = age;
	}
	public A2(String name) {
		this.name = name;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		
	
	A2 a1=new A2(20);
	A2 a2=new A2("rahul");
	A2 a3=new A2("pranay ", 25);
//	a1.display();
	a2.display();
//	a3.display();
	
	}
}
