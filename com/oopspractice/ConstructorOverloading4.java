package com.oopspractice;
class A5{
	int i;
	int j;
	int k;
	
	public A5(int args) {
		i = args;
		
	}
	A5(int args,int args2){
		this(args);
		i=args;
		j=args2;
	}

	public A5(int args, int args2,int args3) {
		this(args,args3);
		j=args2;
		k=args3;
	}
	
}
public class ConstructorOverloading4 {
	public static void main(String[] args) {
	A5 a5= new A5(10, 20,30);
	System.out.println(a5.i);
	System.out.println(a5.j);
	System.out.println(a5.k);
}
}
