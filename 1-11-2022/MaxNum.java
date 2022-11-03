// Program to find Maximum number from two numbers

package basicpackage;

import java.util.Scanner;

public class MaxNum {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter two numbers: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		if(n1>n2)
			System.out.println("Maximum = "+n1);
		else
			System.out.println("Maximum = "+n2);
		scan.close();
	}
	
}
