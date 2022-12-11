package shoppingKartUsingArray;

import java.util.Scanner;

//this class is for all admin operations
public class AdminPanel 
{
	static Scanner  sc = new Scanner(System.in);
	
	//all admin operations listed here
	static void adminOperation()
	{
		int choice;
		do
		{
			System.out.println("Enter 1. for Add Product\n"+
	                  "Enter 2 for Update product\n"
				      +"Enter 3 for delete product\n"
				      +"Enter 4 for show all products\n"
				      +"Enter 5 for show product by Id\n"
				      +"Enter 6 for show all orders\n"
				      +"Enter 7 for go back to the main menu");
			
			System.out.println("===================================");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			System.out.println("===================================");
		
			switch(choice)
			{
				case 1: ProductService.createProduct();
						System.out.println("===================================");
						break;
						
				case 2: ProductService.updateProductById();
						System.out.println("===================================");
						break;
						
				case 3: ProductService.deleteProductById();
						System.out.println("===================================");
						break;
						
				case 4: ProductService.getAllProduct();
						System.out.println("===================================");
						break;
						
				case 5: ProductService.getProductById();
						System.out.println("===================================");
						break; 
						
				case 6: ProductService.showAllOrder();
						System.out.println("===================================");
						break;
						
				case 7: ShoppingKartOperations.AllMenus();
						break;
				
				default: System.out.println("Please enter valid choice!!");
			}
		
		
		}while(choice!=7);
	}
}
