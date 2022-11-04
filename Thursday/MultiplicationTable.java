package basicpackage;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args)
	{
		int n,i,mult;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		System.out.println("*** Table of "+n+" *** ");
		for(i=1;i<=10;i++)
		{
			mult=i*n;
			System.out.println(n+" X "+i+" = "+mult);
		}
		sc.close();
	}
}
