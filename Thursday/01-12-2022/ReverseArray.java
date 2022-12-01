//write a program to print reverse of an array.

package arrayexamples;

import java.util.Scanner;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int arr[],n,i;
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter no. of elements in array: ");
		n = sc.nextInt();
		
		arr = new int[n];
		
		//Accepting array elements
		System.out.println("Enter "+n+" elements in the array:");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//printing original array
		System.out.println("Original array: ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

		//printing reversed array
		System.out.println("\nReversed array: ");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}

/*
OUTPUT:
Enter no. of elements in array: 7
Enter 7 elements in the array:
2
6
1
4
5
8
9
Original array: 
2 6 1 4 5 8 9 
Reversed array: 
9 8 5 4 1 6 2 
*/
