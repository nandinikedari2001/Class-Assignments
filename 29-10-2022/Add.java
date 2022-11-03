package basicpackage;
import java.util.Scanner;
public class Add {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3,sum;
		System.out.print("Enter three Numbers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		sum=num1+num2+num3;
		System.out.print("Sum = "+sum);
		scan.close();
		
	}
}

//public class Add {
//	public static void main(String []args) {
//		int num1, num2, sum;
//		//if (args.length > 0) {
//		num1 = Integer.parseInt(args[0]);
//		num2 = Integer.parseInt(args[1]);
//		sum = num1+num2;
//		System.out.print("Sum of "+num1+" and "+num2+" is "+sum);
//		//}
//	}
//}