package Patterns;

import java.util.Scanner;

public class Increasing_num_prayamid_Pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) 
			{
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			}
			else {
				int k=a+i-1;
				for(int j=1;j<=i;j++) {
					System.out.print(k+" ");
					k--;
					a++;
				}
			}
			System.out.println();
			}
		
	}

}

