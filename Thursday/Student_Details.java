package oopsconcept;
import java.util.Scanner;

class Stud
{
	int id;  // instance variable
	String name,address,course;
	float fees;
	
//	void setData(int i, String n, String add, String c, float f)
	void setData(int id, String name, String address, String course, float fees)
	{
//		id=i;
//		name=n;
//		address=add;
//		course=c;
//		fees=f;
		
		//using this keyword
		// this keyword refers current class object
		// this keyword is used to invoke current class method
		this.id=id;
		this.name=name;
		this.address=address;
		this.course=course;
		this.fees=fees;
		
		//System.out.println("this keyword address: "+this);
		
		//calling a method from another method of the same class
		//compiler automatically adds this keyword to method
		displayData();  //working - it will only possible when both methods are of same class
	}
	void displayData()
	{
		System.out.println("======================================================");
		System.out.println("Id: "+id+"\nName: "+name+"\nAddress: "+address+"\nCourse: "+course+"\nFees: "+fees);
	}
}
public class Student_Details {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int id,n;
		String name,address,course;
		float fees;
		
		System.out.print("Enter no. of student : ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		System.out.println("============================================");	
		System.out.println("Enter Student "+i+" Details : ");
		System.out.print("Enter id : ");
		id = sc.nextInt();
		sc.nextLine();  //It will consume the delimiter(Enter)
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter address : ");
		address = sc.nextLine();
		System.out.print("Enter course : ");
		course = sc.nextLine();
		System.out.print("Enter fees : ");
		fees = sc.nextFloat();
		
		//annonymous object creation
		new Stud().setData(id, name, address, course, fees);
//		new Stud().displayData();
		
//		Stud obj = new Stud();
//		obj.setData(id, name, address, course, fees);
//		System.out.println("obj Object address: "+obj);
//		System.out.print("============================================");
		//obj.displayData();
		
		}
		
//		Stud st = new Stud();
//		System.out.println(st);
//		
//		st.setData(101,"Bobby","Pune","DotNet",7000f); // cslling / invoking method
//		st.displayData();
//		
//		st.setData(102,"Nandu","Pune","Java",2000f);
//		st.displayData();
		
		sc.close();
	}
}
