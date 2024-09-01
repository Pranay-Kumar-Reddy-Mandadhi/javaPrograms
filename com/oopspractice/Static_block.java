package com.oopspractice;
class d{
	static {
		System.out.println("static block in D");
	}
	{
		System.out.println("non-static block in D");
	}
	d(){
		System.out.println("constructor in D");
	}
}
public class Static_block {
public static void main(String[] args) {
	System.out.println("main starts");
	new d();
}
}
