//write a program to find minimum and maximum of an array.

package arrayexamples;

import java.util.Scanner;

public class MinAndMaxElement {
	
	static Scanner sc = new Scanner(System.in); 
	//method for Accepting array elements
	public static int[] setArray(int n)
	{
		int i,arr[];
		
		System.out.println("Enter "+n+" elements in the array:");
		arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	// method to find max element
	public static int maxElement(int[] arr,int n)
	{
		int i,max=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	//method to find min element
	public static int minElement(int[] arr,int n)
	{
		int i,min=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) 
	{

		System.out.print("Enter no. of elements in array: ");
		int n = sc.nextInt();
		
		int arr[] = setArray(n);
		
		System.out.print("Maximum element in array: "+maxElement(arr,n));
		
		System.out.print("\nMinimum element in array: "+minElement(arr,n));

	}

}

/*
 OUTPUT:
Enter no. of elements in array: 7
Enter 7 elements in the array:
2
6
-2
92
45
17
0
Maximum element in array: 92
Minimum element in array: -2
 */
