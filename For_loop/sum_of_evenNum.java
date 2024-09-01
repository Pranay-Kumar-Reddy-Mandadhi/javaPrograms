package For_loop;

import java.util.Scanner;

public class sum_of_evenNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range ");
		int a=s.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			if (i%2==0) {
				System.out.println(i+" is the odd number ");
			sum+=i;
			}
		}
		System.out.println(sum);
	}

}
