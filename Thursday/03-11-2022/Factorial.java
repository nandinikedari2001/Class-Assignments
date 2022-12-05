package basicpackage;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int n,fact=1,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
		sc.close();
	}
}

/*
Enter any number: 5
Factorial of 5 is 120
*/
