//write a program to print all negative numbers in an array

package arrayexamples;

import java.util.Scanner;

public class PrintNegativeElements {

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
		
		//Printing negative elements from the array
		System.out.println("Negative elements in array are: ");
		for(i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}

}

/*
 OUTPUT:
Enter no. of elements in array: 8
Enter 8 elements in the array:
4
-1
7
12
-89
0
-5
2
Negative elements in array are: 
-1 -89 -5 
 */