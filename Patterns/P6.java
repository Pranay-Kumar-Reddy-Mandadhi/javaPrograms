package Patterns;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int spaces=n-1;
        int star=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=spaces; j++) {
                System.out.print("  ");
            }
            	
              	for (int j = 1; j <= star; j++) {
                System.out.print(j+" " );
              	}
                for (int k = i-1; k >=1; k--) {
                System.out.print(k + " ");
            }
            spaces--;
            star++;
            System.out.println();
        }
    }
}
