
package For_loop;

import java.util.Scanner;

public class FibinocciAlternate {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("how many fibanacci series number should print");
		int n=s.nextInt();
		int  a=0;
		int b=1;
		System.out.print(a+" ");
		
		for(int i=2;i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;
			if (i%2==0)
			{
				System.out.print(c+" ");
			}
			
				}
		
	}
}
