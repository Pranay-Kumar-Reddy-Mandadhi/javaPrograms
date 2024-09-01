package For_loop;

import java.util.Scanner;
//odd number 
public class Odd_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range ");
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			if (i%2==1) {
				System.out.println(i+" is the odd number ");
			
			}
	}
	}

}
