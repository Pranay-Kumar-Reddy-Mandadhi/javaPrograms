package Patterns;

import java.util.Scanner;

public class number_changing {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+"\t");
				a++;
			}
			System.out.println();
		}
	}

}
