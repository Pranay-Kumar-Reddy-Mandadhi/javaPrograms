package Methods;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++) {
		if(primenum(i)==true) {
			System.out.print(i+" ");
		}
		
		}
	}
	static boolean primenum(int n) {
		
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
			}
		return true;
		}
		
		
	}

