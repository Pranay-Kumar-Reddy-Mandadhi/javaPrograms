package Inheritance;
class AA{
	void m1() {
		int i=5;
		System.out.println(i);
	}
}
class BB extends AA{
	void m1() {
		super.m1();
		int i=10;
		System.out.println(i);
	}
}
class CC extends BB{
	@Override
		void m1() {
			super.m1();
			int i=30;
			System.out.println(i);
		}
}
public class Test_1 {
	public static void main(String[] args) {
		CC c=new CC();
		c.m1();
	}
}
