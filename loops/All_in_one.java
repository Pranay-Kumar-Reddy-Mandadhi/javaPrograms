package loops;

import java.util.Scanner;

class All_in_one {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("select any one from the below");
		System.out.println("1.smallest of two numbers");
		System.out.println("2. to find the leap year");
		System.out.println("3. Greatest of three numbers");
		System.out.println("4. currency notes");
		System.out.println("5.smallest of three numbers");
		System.out.println("6.even or odd");
		System.out.println("7.vowels or conconents");
		
		int n=s.nextInt();
		switch (n) {
		case 1:{
			//smallest of two numbers
			System.out.println("enter  a value ");
			int a=s.nextInt();
			System.out.println("enter  b value ");
			int b=s.nextInt();
			if (a<b) {
				System.out.println(a+ " is the smallest number ");
				
			}
			else {
				System.out.println(b+ " is the smallest number ");
			}
		}break;
		case 2:{
			//leap year program
			System.out.println("enter the year");
			int year=s.nextInt();
			System.out.println("enter  month  ");
			int month=s.nextInt();
		
					switch (month) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						System.out.println("31 days ");
						
					break;
						case 4:
						case 6:
						case 9:
						case 11:
							System.out.println("30 days ");
							break;
							
						case 2:
							if ((year%4==0&&year%100!=0)||(year%400==0)) {
								System.out.println("29 days");
								}
								else{
									System.out.println("28 days");
								}
					}break;
		}
					case 3:{
					//Greatest if three numbers
						System.out.println("enter  a value ");
						int a=s.nextInt();
						System.out.println("enter  b value ");
						int b=s.nextInt();
						System.out.println("enter  c value ");
						int c=s.nextInt();
						if (a>b&&a>c) {
							System.out.println(a+" is the largest number");
							
						}
						else if (b>c&&b>a) {
							System.out.println(b+ " is the largest number");
						}
						else  {
							System.out.println(c+"  is the largest number");	
						}

					}break;
					case 4:{
						//currency notes
						System.out.println("enter  amount value ");
						int amount=s.nextInt();
						if (amount>=2000) {
							int count=amount/2000;
							amount=amount%2000;
							System.out.println("2000 notes are "+count);
							
						}
						if (amount>=500) {
							int count=amount/500;
							amount=amount%500;
							System.out.println("500 notes are "+count);
						}
					}break;
					case 5:{
						//smallest if three numbers
							System.out.println("enter  a value ");
							int a=s.nextInt();
							System.out.println("enter  b value ");
							int b=s.nextInt();
							System.out.println("enter  c value ");
							int c=s.nextInt();
							if (a<b&&a<c) {
								System.out.println(a+" is the smallest number");
								
							}
							else if (b<c&&b<a) {
								System.out.println(b+ " is the smallest number");
							}
							else  {
								System.out.println(c+"  is the smallest number");	
							}

						}break;
					case 6:{
						//even or odd
						System.out.println("enter  a value ");
						int a=s.nextInt();
						String res=a%2==0?"even":"odd";
						System.out.println(res);
						
					}break;
					case 7:{
						//vowel or consonent
						System.out.println("enter the char");
						char ch=s.next().charAt(0);
						if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
						{
							System.out.println(ch+" is a vowel");
						}
						else {
							System.out.println(ch+ " is a consonent");
						}
					}break;

						

					default:
					{
						System.out.println("enter the correct number ");
						break;
					}
		}

	}
}
