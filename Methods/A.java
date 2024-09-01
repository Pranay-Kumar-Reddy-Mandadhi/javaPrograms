package Methods;

public class A {

	public static void main(String[] args) {
		int a=3;
		System.out.println(m1(30));
		
		System.out.println(m1(m1(30)));
		
	}
	static int m1(int a) {
		return a*5;
	}

}
