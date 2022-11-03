package basicpackage;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("Enter any number: ");
		num = scan.nextInt();
		if(num%2==0)
			System.out.println(num+" is Even Number");
		else
			System.out.println(num+" is Odd Number");
		scan.close();
	}
}


