package Patterns;

import java.util.Scanner;

public class Dimond_prg {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int spaces=size-1;
	int stars=1;
	for(int i=1;i<=size;i++) {
		for(int j=1;j<=spaces;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=stars;j++) {
			
			System.out.print("*");
			
		}
		System.out.println();
		if(i<=size/2) {
			spaces--;
			stars+=2;
			
		}
		else {
			spaces++;
			stars-=2;
			
		}
}
}
}
