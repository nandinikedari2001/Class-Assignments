package basicpackage;

import java.util.Scanner;

public class FirstAndLastDigit {
	public static void main(String[] args)
	{
		int n,F_digit,L_digit,num,rem,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		num=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		F_digit =rev%10;
		L_digit = num%10;
		System.out.println("First Digit : "+F_digit);
		System.out.println("Last Digit : "+L_digit);
		sc.close();
		
	}
}
