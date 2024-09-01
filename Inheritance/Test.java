package Inheritance;
class A{
	void m1() {
		System.out.println("m1-a");
	}
}
class B extends A{
	@Override
	void m1() {
		super.m1();
		System.out.println("m1-b");
	}
	
}
class C extends B{
	@Override
	void m1() {
		super.m1();
		System.out.println("m1-c");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.m1();

	}

}
