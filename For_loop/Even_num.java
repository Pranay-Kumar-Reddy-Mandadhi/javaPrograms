package For_loop;

import java.util.Scanner;
//even number 
public class Even_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range ");
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			if (i%2==0) {
				System.out.println(i+" is the even number ");
			
			}
			}


	}

}
