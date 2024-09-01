package For_loop;

import java.util.Scanner;

public class Fabinacci_series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("how many fibanacci series number should print");
		int n=s.nextInt();
		int  a=0;
		int b=1;
		
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++) {
			int c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
			
		}

	}

}
