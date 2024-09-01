package For_loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int product=1;
		for(int i=a;i!=0;i--) {
			product*=i;
		}
		System.out.println(product);

	}

}
