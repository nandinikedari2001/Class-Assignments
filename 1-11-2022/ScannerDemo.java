package basicpackage;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter any Number: ");
		num = sc.nextInt();
		System.out.println("Number is: "+num);
		sc.close();
	}
}
