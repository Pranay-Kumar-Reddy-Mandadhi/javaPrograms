package Abstraction;
abstract class empname{
	abstract void  display();
}
public class emp {
	public static void main(String[] args) {
		empname e1=new empname() {
			
			@Override
			void display() {
				System.out.println("hello");
			}
		};
		e1.display();
		System.out.println("pranay");
	}

}
