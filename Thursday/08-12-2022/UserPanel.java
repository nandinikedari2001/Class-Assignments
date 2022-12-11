package shoppingKartUsingArray;

import java.util.Scanner;

//this class is for user menus 
public class UserPanel 
{
	static Scanner sc = new Scanner(System.in);
	
	//this method listed all user menus
	static void userOperation()
	{
		int choice;
		do
		{
			System.out.println("Enter 1 for Book Product\n"+
	                  "Enter 2 for cancel product\n"
				      +"Enter 3 for go back to the main menu");
			
			System.out.println("===================================");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			System.out.println("===================================");
			
			switch(choice)
			{
				case 1: ProductService.bookProduct();
						System.out.println("===================================");
						break;
						
				case 2: ProductService.cancelOrder();
						System.out.println("===================================");
						break;
						
				case 3: ShoppingKartOperations.AllMenus();
						break;
				
				default: System.out.println("Please enter valid choice!!");
			}
		}while(choice!=3);
	}
}
