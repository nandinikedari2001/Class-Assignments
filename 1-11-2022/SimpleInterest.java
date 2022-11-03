//Write a program to calculate simple interest

package basicpackage;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		float SI,rate,time,PAmt;
		
		System.out.print("Enter principle amount: ");
		PAmt = scan.nextFloat();
		
		System.out.print("Enter rate: ");
		rate = scan.nextFloat();
		
		System.out.print("Enter time period in years: ");
		time = scan.nextFloat();
		
		SI = (PAmt*rate*time)/100;
		System.out.print("Simple Interest = "+SI);
		
		scan.close();
		
	}
}
