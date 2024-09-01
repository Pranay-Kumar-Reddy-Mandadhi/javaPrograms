package For_loop;

import java.util.Scanner;

public class Count_num_of_digits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int count=0;
		int temp=0;
		for(int i=0;i<=a;i++) {
			if (true) {
				int n=a/10;
				//temp=n;
				count++;	
				a=n;
//alternate 
				/* for(;n>0;n=n/10){
				 * count++
				 * }*/

			}
		}
		System.out.println(count);

}
}




