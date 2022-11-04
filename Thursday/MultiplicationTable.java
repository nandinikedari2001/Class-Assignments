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

/*
OUTPUT:
Enter any number: 17
*** Table of 17 *** 
17 X 1 = 17
17 X 2 = 34
17 X 3 = 51
17 X 4 = 68
17 X 5 = 85
17 X 6 = 102
17 X 7 = 119
17 X 8 = 136
17 X 9 = 153
17 X 10 = 170
*/
