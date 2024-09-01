package Abstraction;
abstract class DemoAbstractClass { 
	abstract void display(); 
} 

public class JavaApplication { 
	public static void main(String[] args) 
	{ 
		DemoAbstractClass AC = new DemoAbstractClass() { 
			void display() 
			{ 
				System.out.println("Hi."); 
			} 
		}; 
		AC.display(); 
		System.out.println("How are you?"); 
	} 
} 

