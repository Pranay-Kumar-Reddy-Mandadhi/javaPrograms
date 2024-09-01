package loops;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  a value ");
		int a=s.nextInt();
		if (a>=91&&a<=99) {
			System.out.println("the grade is O ");
			
		}
		else if (a>=80&&a<=90) {
			System.out.println("the grade is A");
			
		}
		else if (a>=60&&a<=79) {
			System.out.println("the grade is B");
			
			
		}
		else if (a>=40&&a<=59) {
			System.out.println("the grade is C");
			
		}
		else if (a>=37&&a<=39) {
			System.out.println("the grade is D");
			
		} else {
			System.out.println("he failed in exam ");
		}
	}

}
