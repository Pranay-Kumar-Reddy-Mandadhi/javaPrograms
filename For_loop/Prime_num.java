package For_loop;

import java.util.Scanner;

public class Prime_num {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int  a=s.nextInt();
	int count=0;
	
	if (a<=1) {
		count++;
		
	}
	for(int i=2;i<a/2;i++) {
		if (a%i==0) {
			count++;
			break;
}
}
	if (count==0) {
		System.out.println(a+" is a prime number");
		
	}
	else {
		System.out.println(a+" is not the prime number ");
	}
}
}
