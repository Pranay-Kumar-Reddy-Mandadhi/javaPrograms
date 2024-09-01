package com.oopspractice;
class A1{
	int i;
	int j;
	void m1() {
		int i=5;
		System.out.println(i);//5
		System.out.println(this.j);//20
	}
}
public class this_keyword {
public static void main(String[] args) {
	A1 a1=new A1();
	a1.i=10;
	a1.j=20;
	A1 a2=new A1();
	a2.j=40;
	A1 b1=new A1();
	b1.j=90;
//	System.out.println(a1.i);
	a1.m1();
}
}
