package com.oopspractice;
class A9{
	int i;

	 A9(int i) {
		this.i = i;
	}
	void m1() {
		System.out.println(i);
	}
}
class B{
	void m2(A9 a) {
		a.m1();
	}
}
public class This_keyword_1 {
public static void main(String[] args) {
	A9 a1=new A9(20);
	A9 a2=new A9(30);
	B b1=new B();
	b1.m2(a2);
}
}
