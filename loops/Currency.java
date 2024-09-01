package loops;

import java.util.Scanner;

 class Currency {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  amount value ");
		int amount=s.nextInt();
		if (amount>=2000) {
			int count=amount/2000;
			amount=amount%2000;
			System.out.println("2000 notes are "+count);
			
		}
		if (amount>=500) {
			int count=amount/500;
			amount=amount%500;
			System.out.println("500 notes are "+count);
		}

	}

}
