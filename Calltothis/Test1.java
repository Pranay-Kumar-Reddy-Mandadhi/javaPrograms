package Calltothis;
class A{
	int i;
	int j;
	A(int i,int j){
		this.i=i;
		this.j=j;
	}
	void m1(A s) {
		System.out.println("i="+s.i);
		System.out.println("j="+s.j	);
	}
}
public class Test1 {

	public static void main(String[] args) {
		A a1=new A(10,20);
		
		A a2=new A(20,30);
		a1.m1(a2);
	}

}
