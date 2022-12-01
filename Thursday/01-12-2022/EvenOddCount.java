//write a program to count total number of odd and even numbers from an array.

package arrayexamples;

import java.util.Scanner;

public class EvenOddCount 
{
	public static void main(String[] args) 
	{
		int arr[],n,i,j,evenCount=0,oddCount=0;
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

		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.print("Even element count : "+evenCount+
				"\nOdd element count : "+oddCount);
	}

}

/*
 OUTPUT:
Enter no. of elements in array: 6
Enter 6 elements in the array:
12
-75
16
7
43
90
Even element count : 3
Odd element count : 3
 */