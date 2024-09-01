package loops;

import java.util.Scanner;

public class Second_largest {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter a value");
	int a = s.nextInt();
	System.out.println("enter b value");
	
    int b = s.nextInt();
    System.out.println("enter c value ");
    int c = s.nextInt();

    int secondLargest;

    if (a > b && a > c) {
        if (b > c) {
            secondLargest = b;
        } else {
            secondLargest = c;
        }
    } else if (b > a && b > c) {
        if (a > c) {
            secondLargest = a;
        } else {
            secondLargest = c;
        }
    } else {
        if (a > b) {
            secondLargest = a;
        } else {
            secondLargest = b;
        }
    }

    System.out.println("The second largest number among " + a + ", " + b + ", and " + c + " is: " + secondLargest);
}
}
