package For_loop;

import java.util.Scanner;
//sum of factors 
 class sum_of_factors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if (a%i==0) {
				System.out.println(i);
				sum+=i;				
			}
		}
			System.out.println(sum);
			}

	}

 
 