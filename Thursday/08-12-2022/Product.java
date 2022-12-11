package shoppingKartUsingArray;

//java bean
public class Product 
{
	private int id;
	private String name,brand;
	private double price;
	private int quantity;
	
	public Product(int id, String name, String brand, double price, int quantity) 
	{
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product()
	{
		super();
	}
	
	//getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//to string method
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	

//	Scanner sc = new Scanner(System.in);
//
//	public Product AddProduct()
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter product ID: ");
//		id = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("Enter product Name: ");
//		name = sc.nextLine();
//		
//		System.out.println("Enter product Brand: ");
//		brand = sc.nextLine();
//		
//		System.out.println("Enter product Price: ");
//		price = sc.nextInt();
//		
//		System.out.println("Enter product Quantity: ");
//		quantity = sc.nextInt();
//		
//		Product product = new Product(id, name, brand, price, quantity);
//		return product;
//		
//	}
//	
//	public void displayAllProduct()
//	{
//		System.out.println("Product id: "+id+ "\nProduct Name: "+name+"\nProduct Brand: "+brand+"\nProduct Price: "+price+"\nProduct Quantity: "+quantity);
//	}

}
