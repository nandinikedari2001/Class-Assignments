//write a program to copy all elements from one array to another.

package arrayexamples;

import java.util.Scanner;

public class CopyElements 
{

	public static void main(String[] args) 
	{
		int arr1[],arr2[],n,i;
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter no. of elements in array: ");
		n = sc.nextInt();
		
		arr1 = new int[n];
		
		arr2 = new int[n];
		
		//Accepting array elements
		System.out.println("Enter "+n+" elements in the array:");
		for(i=0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		//copying elements from arr1[] to arr2[]
		for(i=0;i<n;i++)
		{
			arr2[i] = arr1[i]; 
		}
		
		//printing arr2 elements
		System.out.println("After copying elements from arr1 to arr2, arr2 will be : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr2[i]+" ");
		}

	}

}
