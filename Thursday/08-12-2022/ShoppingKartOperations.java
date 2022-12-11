package shoppingKartUsingArray;

import java.util.Scanner;

public class ShoppingKartOperations 
{
	static Scanner sc = new Scanner(System.in);
	
	static void AllMenus()
	{
		int choice;
//		do {
//		System.out.println("~ Welcome To Shopping Kart ~");
//		System.out.println("===================================");
//		System.out.println("Enter 1 for Add Product "
//				+ "\nEnter 2 for display product"
//				+ "\nEnter 3 for display Product details by Id"
//				+ "\nEnter 4 for update product details"
//				+ "\nEnter 5 for delete product details"
//				+ "\nEnter 6 for book product"
//				+ "\nEnter 7 for Cancel booked product "
//				+ "\nEnter 8 for show all order"
//				+ "\nEnter 9 for quit");
//
//		System.out.println("===================================");
//		choice = sc.nextInt();
//		System.out.println("===================================");
//		
//		
//		switch(choice)
//		{
//			case 1: ProductService.createProduct();
//					System.out.println("===================================");
//					break;
//					
//			case 2: ProductService.getAllProduct();
//					System.out.println("===================================");
//					break;
//					
//			case 3: ProductService.getProductById();
//					System.out.println("===================================");
//					break; 	
//				
//			case 4: ProductService.updateProductById();
//					System.out.println("===================================");
//					break; 	
//					
//			case 5: ProductService.deleteProductById();
//					System.out.println("===================================");
//					break;
//					
//			case 6: ProductService.bookProduct();
//					System.out.println("===================================");
//					break; 
//					
//			case 7: ProductService.cancelOrder();
//					System.out.println("===================================");
//					break;
//				
//			case 8: ProductService.showAllOrder();
//					System.out.println("===================================");
//					break; 
//					
//			case 9: break;
//			
//			default: System.out.println("Please enter valid choice.");
//		}
//		}//end of do
//		while(choice!=9);
		
		do {
			System.out.println("~ Welcome To Shopping Kart ~");
			System.out.println("===================================");
			System.out.println("Enter 1 for Admin Panel "
							+ "\nEnter 2 for User Panel"
							+ "\nEnter 3 for quit");
			
			System.out.println("===================================");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			System.out.println("===================================");
			
			switch(choice)
			{
				case 1: AdminPanel.adminOperation();
						break;
						
				case 2: UserPanel.userOperation();
						break;
						
				case 3: break;
				
				default: System.out.println("Please enter valid choice!!");
			}
			
		}while(choice!=3);
		
	}
}
