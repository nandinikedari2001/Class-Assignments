//Write a program to find out number or occurence of one alphabets.

package stringexamples;

import java.util.Scanner;

public class NumberOfOccurence 
{
	public static void main(String[] args) 
	{
		int i,count=0;
		String str;
		char ch=0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		str = sc.nextLine();
		
		System.out.print("Enter character to find occurence: ");
		ch = sc.next().charAt(ch); 
		
		for(i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println("'"+ch+"' occured "+count+" times in the string '"+str+"'");
	
		sc.close();
	}

}

/*
 OUTPUT:
Enter string : i love my india!
Enter character to find occurence: i
'i' occured 3 times in the string 'i love my india!'
*/