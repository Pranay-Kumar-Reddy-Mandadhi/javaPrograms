package For_loop;

import java.util.Scanner;

public class Perfect_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if (a%i==0) {
				sum+=i;				
			}
		}
			if (sum==a) {
				System.out.println(a+" is the perfect number");
				
			}
			else {
				System.out.println(a+" is not a perfect number");
			}
			}


	}
