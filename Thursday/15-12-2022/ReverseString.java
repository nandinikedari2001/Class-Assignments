//write a program to print reverse of a string.

package stringexamples;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		int i;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		str = sc.nextLine();
		
		System.out.print("Reversed String: ");
		for(i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		sc.close();
	}

}

/*
 OUTPUT:
Enter string : Hello World!
Reversed String: !dlroW olleH
*/