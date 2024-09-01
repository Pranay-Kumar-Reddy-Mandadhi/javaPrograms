package loops;

import java.util.Scanner;

public class Second_Smallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int a = s.nextInt();
		System.out.println("enter b value");
		
	    int b = s.nextInt();
	    System.out.println("enter c value ");
	    int c = s.nextInt();

	    int secondSmallest;

	    if (a < b && a < c) {
	        if (b < c) {
	            secondSmallest = b;
	        } else {
	            secondSmallest = c;
	        }
	    } else if (b < a && b < c) {
	        if (a < c) {
	            secondSmallest = a;
	        } else {
	            secondSmallest = c;
	        }
	    } else {
	        if (a < b) {
	            secondSmallest = a;
	        } else {
	            secondSmallest = b;
	        }
	    }

	    System.out.println("The second smallest number among " + a + ", " + b + ", and " + c + " is: " + secondSmallest);
	}

	}

