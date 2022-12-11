package shoppingKartUsingArray;

import java.util.Scanner;

public class ProductService 
{
	static Product product[] = new Product[10];
	static OrderDetails order[] = new OrderDetails[10];
	
	static Scanner sc = new Scanner(System.in);
	static int index=0,orderIndex=0;
	
	//this method is responsible to add product in the array
	public static void createProduct()
	{
		System.out.print("Enter product id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter product name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter product brand: ");
		String brand = sc.nextLine();
		
		System.out.print("Enter product price: ");
		double price = sc.nextDouble();
		
		System.out.print("Enter product quantity: ");
		int quantity = sc.nextInt();
		
		// this will insert in an array
		product[index] = new Product(id, name, brand, price, quantity);
		index++;
		System.out.println("Product added successfully!!");
		
	}
	//this method is responsible to retrieve all product details
	public static void getAllProduct()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Product id: "+product[i].getId());
			System.out.println("Product name: "+product[i].getName());
			System.out.println("Product brand: "+product[i].getBrand());
			System.out.println("Product price: "+product[i].getPrice());
			System.out.println("Product stock: "+product[i].getQuantity());
			System.out.println("===================================");
		}
	}
	
	//this method is responsible to retrieve product details by id
	public static void getProductById()
	{
		boolean f=false;
		System.out.print("Enter id to search product: ");
		int id = sc.nextInt();
		System.out.println("===================================");
		
		for(int i=0;i<index;i++)
		{
			if(product[i].getId()==id)
			{
				System.out.println("Product id: "+product[i].getId());
				System.out.println("Product name: "+product[i].getName());
				System.out.println("Product brand: "+product[i].getBrand());
				System.out.println("Product price: "+product[i].getPrice());
				System.out.println("Product stock: "+product[i].getQuantity());
				System.out.println("===================================");
				f=true;
				break;
			}
		}
		if(f==false)
		{
			System.out.println("Product Id not found!!");
			System.out.println("====================================");
		}
	}
	
	//this method is responsible for book a product
	static void bookProduct()
	{
		boolean f = false;
		sc.nextLine();
		System.out.print("Enter product name: ");
		String name = sc.nextLine();
		System.out.println("===================================");
		
		for(int i=0;i<index;i++)
		{
			if(product[i].getName().equalsIgnoreCase(name))
			{
				System.out.println("Product id: "+product[i].getId());
				System.out.println("Product name: "+product[i].getName());
				System.out.println("Product brand: "+product[i].getBrand());
				System.out.println("Product price: "+product[i].getPrice());
				if(product[i].getQuantity()<=0)
				{
					System.out.println("Out of Stock");
				}
				else
				{
					System.out.println("Product stock: "+product[i].getQuantity());
				}
				System.out.println("===================================");
				f=true;
			}
			
		}
		if(f==true)
		{
			System.out.println("for booking, Enter Id:");
			int id = sc.nextInt();
			
			for(int i=0;i<index;i++)
			{
				if(product[i].getId()==id)
				{
					System.out.print("Enter Quantity: ");
					int quantity = sc.nextInt();
					
					if(product[i].getQuantity()>quantity);
					{
						System.out.println("Your booking has done successfully!!");
						double total = quantity * product[i].getPrice();
						
						System.out.println("Booking Details: ");
						System.out.println("Product Name: "+product[i].getName());
						System.out.println("Product Brand: "+product[i].getBrand());
						System.out.println("Product Quantity: "+quantity);
						System.out.println("Total Amount: "+total);
						
						//updating stock after booking order
						product[i].setQuantity(product[i].getQuantity() - quantity);
						order[orderIndex] = new OrderDetails(id,id,name,product[i].getBrand(),quantity,total);
						orderIndex++;
						break;
					}
				}
				
			}
		}
		
	}
	
	//this method is responsible to show all order details
	static void showAllOrder()
	{
		System.out.println("Order History");
		System.out.println("===================================");
		
		for(int i=0;i<orderIndex;i++)
		{
			System.out.println("Order Id: "+order[i].getOrderId());
			System.out.println("Product name: "+order[i].getProductName());
			System.out.println("Product brand: "+order[i].getBrand());
			System.out.println("Order quantity: "+order[i].getQuantity());
			System.out.println("Total order amount: "+order[i].getTotalAmount());
			System.out.println("===================================");
			
		}
	}
	
	//this method is responsible for update product details using id
	static void updateProductById()
	{
		boolean status=false;
		System.out.print("Enter product id to update product details: ");
		int id = sc.nextInt();
		
		for(int i=0;i<index;i++)
		{
			if(id==product[i].getId())
			{
				System.out.print("Enter new product id: ");
				int pid = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter new product name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter new product brand: ");
				String brand = sc.nextLine();
				
				System.out.print("Enter new product price: ");
				double price = sc.nextDouble();
				
				System.out.print("Enter new stock: ");
				int quantity = sc.nextInt();
				
				// this will insert in an array
				product[i] = new Product(id, name, brand, price, quantity);
				System.out.println("Product added successfully!!");
				status = true;
			}
		}
		if(status==false)
		{
			System.out.println("Product not found!!");
			System.out.println("===================================");
		}
	}
	
	//this method is responsible for delete product details using id
	static void deleteProductById()
	{
		boolean status=false;
		System.out.print("Enter product id to delete product details: ");
		int id = sc.nextInt();
		
		for(int i=0;i<index;i++)
		{
			if(id==product[i].getId())
			{
				for(int j=i;j<index-1;j++)
				{
					product[j] = product[j+1];
				}
				index--;
				System.out.println("Product deleted successfully!!");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Product id not found!!");
			System.out.println("===================================");
		}
	}
	
	//this method is responsible for cancel order
	static void cancelOrder()
	{
		boolean status = false;
		System.out.println("Enter product id to cancel booking: ");
		int OId = sc.nextInt();
		
		for(int i=0;i<orderIndex;i++)
		{
			if(OId==order[i].getOrderId())
			{
				//loop for increasing product stock
				for(int k=0;k<index;k++) //loop for product
				{
					if(product[k].getId()==order[i].getProductId())
					{
						//increasing the stock in product array
						product[k].setQuantity(product[k].getQuantity() + order[i].getQuantity());  
					}
				}
				
				//loop to delete order details from array
				for(int j=0;j<orderIndex-1;j++)
				{
					order[j] = order[j+1];
				}
				orderIndex--;
				System.out.println("Your Order cancelled successfully!!");
				status = true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Product id not found!!");
			System.out.println("===================================");
		}
	}
	
}
