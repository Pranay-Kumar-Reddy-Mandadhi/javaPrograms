package For_loop;
//factors number 
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int sum=0;
		
		for(int i=1;i<a;i++) {
			if (a%i==0) {
				System.out.println(i);
			
			}
	}

}
}
