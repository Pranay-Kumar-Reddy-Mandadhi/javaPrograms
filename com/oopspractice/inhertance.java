package com.oopspractice;
class in{
	int i;
	void m1(int i) {
		System.out.println("i="+i);
	}
}
class in1 extends in{
	int j;
	void m2(int j) {
		System.out.println("j="+j);
	}
}
public class inhertance  {

	public static void main(String[] args) {
		in1 i=new in1();
		i.m1(10);
		i.m2(20);
	}
}
