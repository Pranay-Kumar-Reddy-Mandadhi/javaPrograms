package Patterns;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char ch='A';
		int spaces=n-1;
		int stars=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j%2!=0) {
					System.out.print(" ");
				}else {
				System.out.print(ch);
				ch++;
				}
			}
			spaces--;
			stars+=2;
			System.out.println();
		}

	}

}
