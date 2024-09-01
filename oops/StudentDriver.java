package oops;

import java.util.Scanner;

public class StudentDriver {
	String name;
	int age ;
	long mobilenum;
	static String Institute="j-spiders";

	public static void main(String[] args) {
	StudentDriver s1=new StudentDriver();
	s1.Addstudent();
	StudentDriver s2=new StudentDriver();
	s2.Addstudent();
	//StudentDriver s3=new StudentDriver();
	//s3.Addstudent();
	s1.display();
	s2.display();
	//s3.display();
	
	}
	public void Addstudent() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name of the student");
		name=s.nextLine();
		System.out.println("enter the age ");
		age=s.nextInt();
		System.out.println("enter the mobile number ");
		mobilenum=s.nextLong();		
	}
	public void display() {
		System.out.println("name      ="+"\t"+name);
		System.out.println("age=      ="+"\t"+age);
		System.out.println("mobilenum ="+"\t"+mobilenum);
		System.out.println("institute ="+"\t"+Institute);
		System.out.println("==================================");
	}

}
