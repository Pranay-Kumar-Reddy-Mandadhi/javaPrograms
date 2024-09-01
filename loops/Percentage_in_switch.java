package loops;

import java.util.Scanner;
class Percentage_in_switch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  a value ");
		char ch=s.next().charAt(0);
		switch (ch) {
		case 'O':{
			System.out.println("the percentage is between 91-99");
			
		}	break;
		case 'A':{
			System.out.println("the percentage is between 80-90 ");
			
		}break;
		case 'B':{
			System.out.println("the percentage is between 60-79 ");
		}break;
		case 'C':{
			System.out.println("the perncetage is between 40-59");
		}break;
		case 'D':{
			System.out.println("the perntage is between 37-39");
			
		}break;
		case 'F':{
			System.out.println(" the perntage is between 0-36");
		}break;
			

		default:
			System.out.println("enter the correct character in upper case");
			break;
		}
	}

}
