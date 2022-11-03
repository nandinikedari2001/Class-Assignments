package basicpackage;

import java.util.Scanner;


public class Sub {

		public static void main(String []args) {
			Scanner scan = new Scanner(System.in);
			int num1,num2,sub;
			System.out.print("Enter two Numbers: ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			sub=num1-num2;
			System.out.print("Difference between "+num1+" and "+num2+" is "+sub);
			scan.close();
			
		}
	}

