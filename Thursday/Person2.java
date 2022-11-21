package oopsconcept;
import java.util.Scanner;

public class Person2 
{
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	void acceptName()
	{
		System.out.print("Enter name: ");
		name = sc.nextLine();
	}
	

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	void displayName()
	{
		System.out.println("\n=========== Employee Details ==========");
		System.out.print("Name: "+getName());
	}
}
