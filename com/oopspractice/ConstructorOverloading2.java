package com.oopspractice;
class A3{
	A3(){
		System.out.println("no args constructor");
		
	}
	A3(int i){
		super();
		System.out.println("one arg constructor ");
	}
	A3(int i,int j){
		System.out.println("two args constructor");
	}
}
public class ConstructorOverloading2 {

	public static void main(String[] args) {
		A3 a3=new A3();
		A3 a4=new A3(10);
		A3 a5=new A3(20,30);
		

	}

}
