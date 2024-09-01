package com.oopspractice;
class A4{
	void m1() {
		System.out.println("m1-A");
	}
}
public class ConstructorOverloading3 {
	public static void main(String[] args) {
		A4 a4=new A4();//calls the default constructor 
		a4.m1();
		
	}
}
