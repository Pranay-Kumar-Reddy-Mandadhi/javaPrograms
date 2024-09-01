//pattern
package loops;

import java.util.Scanner;

public class Inc {
	public static void main(String[] args) {
		//input : 6
		//output :8,10,12
		// input:-9
		//output:-11,-13,-15
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  number ");
		int a=s.nextInt();
		if(a>0&&a%2==00) {
			a=a+2;
			System.out.println(a);
			a=a+2;
			System.out.println(a);
			a=a+2;
			System.out.println(a);
		}else if (a<0&&a%2!=0) {
			a=a-2;
			System.out.println(a);
			a=a-2;
			System.out.println(a);
			a=a-2;
			System.out.println(a);
		}else if (a<0&&a%2==00) {
			System.out.println("enter the odd negative number ");	
		}
		else if (a>0&&a%2!=0) {
			System.out.println("enter the even positive number");
		}
		else if(a==0)
		{
			System.out.println("enter either positive or negative number ");	
		}
		
	}

}
