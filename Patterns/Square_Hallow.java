package Patterns;

import java.util.Scanner;

public class Square_Hallow {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(i==1||j==1||i==size||j==size) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
