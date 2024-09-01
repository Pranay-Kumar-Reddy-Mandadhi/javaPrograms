package For_loop;


import java.util.Scanner;

//print the natural numbers 
public class Num {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range ");
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println(i);
		}
		
	}

}
