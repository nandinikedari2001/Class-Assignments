// Program to check entered character is upper-case, lower-case, digit or special symbol.

package basicpackage;
import java.util.Scanner;

public class IdentifyType {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		char ch=0;
		System.out.print("Enter any character : ");
		ch = scan.next().charAt(ch);
		
		// Converting entered character to its ASCII value
		int asc = (int) ch;
		System.out.println("ASCII value of "+ch+" is "+asc);
		
		if(asc>=48 && asc<58)
			System.out.println(ch+" is a Digit.");
		
		else if(asc>=65 && asc<91)
			System.out.println(ch+" is a Upper-case Character.");
		
		else if(asc>=97 && asc<123)
			System.out.println(ch+" is a Lower-case Character.");
		
		else if((asc>=33 && asc<48)||(asc>=58 && asc<65)||(asc>=91 && asc<97)||(asc==126))
			System.out.println(ch+" is a Special Symbol.");
		
		scan.close();
		}
}
/*
 OUTPUT:
 
Enter any character : Q
ASCII value of Q is 81
Q is a Upper-case Character.

Enter any character : 7
ASCII value of 7 is 55
7 is a Digit.

*/