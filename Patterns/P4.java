package Patterns;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				if(j%2==0) {
					System.out.print("*");
					}
				else {
					System.out.print(a);
					a++;
				}
			}
			System.out.println();
			}
			
		}
}

