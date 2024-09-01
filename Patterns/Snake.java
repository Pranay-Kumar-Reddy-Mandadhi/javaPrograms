package Patterns;

import java.util.Scanner;

public class Snake {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int k=(n*i)-(n-1);
				for(int j=1;j<=i;j++) {
					System.out.print(k+"\t");
					k++;
				}
			}else {
				int l=n*i;
				for(int j=1;j<=i;j++) {
					System.out.print(l+"\t");
					l--;
				}
			}
			System.out.println();
		}

	}

}
