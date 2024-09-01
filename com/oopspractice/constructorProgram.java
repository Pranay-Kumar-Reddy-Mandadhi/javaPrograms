package com.oopspractice;
class A{
	String name;
	String fathername;
	public A(String name, String fathername) {
		this.name = name;
		this.fathername = fathername;
	}
	void display() {
		System.out.println("name is: "+name);
		System.out.println("father name is :"+fathername);
	}
	
}

public class constructorProgram {

	public static void main(String[] args) {
		A a1=new A("Pranay" ,"jagan mohan reddy");
		a1.display();
		

	}

}
