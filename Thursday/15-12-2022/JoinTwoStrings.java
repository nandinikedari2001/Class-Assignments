// Write a program to join two strings

package stringexamples;

import java.util.Scanner;

public class JoinTwoStrings 
{
	public static void main(String[] args) 
	{
		String str1, str2, str3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st string: "); 
		str1 = sc.nextLine();   // accept 1st string 
		
		System.out.print("Enter 2nd string: ");
		str2 = sc.nextLine();   // accept 2nd string
		
		str3 = str1+str2;     //join two strings
		
		System.out.print("After joining two strings newly formed string will be: "+str3);
		
		sc.close();
	}

}

/*
 OUTPUT:
Enter 1st string: We are Learning
Enter 2nd string:  Java String!!
After joining two strings newly formed string will be: We are Learning Java String!!
 */
