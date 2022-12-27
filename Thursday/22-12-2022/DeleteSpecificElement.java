//Program to remove specific element from an array.

package arrayexamples;

import java.util.Scanner;

public class DeleteSpecificElement 
{

	public static void main(String[] args) 
	{
		int n,i,j,k=1,del;
		boolean f=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		n = sc.nextInt();
		
		//initializing array
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" elements in array:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//accepting the element that you want to delete
		System.out.print("Enter element that you want to delete: ");
		del = sc.nextInt();
		
		//printing specific array
		System.out.println("Original Array: ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		// delete specific element from array
		for(i=0;i<n;i++)
		{
			if(del==arr[i])
			{
				arr[i]=arr[i+1];
				f=true;
			}
		}
		
		if(f==true) {
		System.out.println("\nAfter deleting element array will be: ");
		for(i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}	
		else
			System.out.println("\nElement not found!!");
	}

}

/*
 OUTPUT:
Enter no. of elements: 7
Enter 7 elements in array:
7
6
5
4
3
2
1
Enter element that you want to delete: 4
Original Array: 
7 6 5 4 3 2 1 
After deleting element array will be: 
7 6 5 3 3 2  
 */
