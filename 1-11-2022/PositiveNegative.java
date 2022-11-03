package basicpackage;

import java.util.Scanner;

public class PositiveNegative {
		public static void main(String []args) {
			Scanner scan = new Scanner(System.in);
			int num;
			System.out.print("Enter any number: ");
			num = scan.nextInt();
			if(num>0)
				System.out.println(num+" is Positive Number");
			else if(num<0)
				System.out.println(num+" is Negative Number");
			else
				System.out.println("Entered number is Zero");
			scan.close();
		}
}
