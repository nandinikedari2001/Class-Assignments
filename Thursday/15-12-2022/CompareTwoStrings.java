//write a program to compare two strings.

package stringexamples;

import java.util.Scanner;

public class CompareTwoStrings 
{
	public static void main(String[] args) 
	{
		String str1, str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		str1 = sc.nextLine();
		
		System.out.print("Enter another string to compare: ");
		str2 = sc.nextLine();
		
		if(str1==str2)
			System.out.println("Both strings are Identical !!");
		else
			System.out.println("Strings are not Identical !!");
			//\nThey are differ by "+(str1==str2));
		
		sc.close();
	}
}

/*
 OUTPUT:
Enter string: Hello
Enter another string to compare: hello
Strings are not Identical !!
 */