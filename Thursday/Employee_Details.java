/*
 Create Employee class.assign variables like id,name,basic salary and designation. 
 Using method add values into it. Calculate annual salary base on basic salary.
 Calculate Travel allowance(TA) based on designation. 
 If employee’s designation is manager then provide TA 2000 and 
 if employee is not a manager then provide 1500 TA.
 at last print details of employee along with the annual salary and TA.
 */

package oopsconcept;
import java.util.Scanner;
class Employee
{
	int id,basicSal,TA,TotalSal,AnnualSal;
	String name,designation;
	
	void acceptDetails(int id,String name,String designation,int basicSal)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSal=basicSal;
		travelAllowance(designation);
		calculateAnnualSal(basicSal,TA);
		displayDetails();
		
	}
	void travelAllowance(String designation)
	{
		if(designation.equalsIgnoreCase("Manager"))
			TA = 2000;
		else
			TA=1500;
	}
	void calculateAnnualSal(int basicSal,int TA)
	{
		TotalSal = basicSal+TA;
		AnnualSal = 12*basicSal + 12*TA;
	}
	void displayDetails()
	{
		System.out.println("==========================================");
		System.out.println("******* Employee Details *******");
		System.out.println("===========================================");
		System.out.println("ID: "+id+"\nName: "+name+"\nDesignation: "+designation+
				"\nBasic Salary: "+basicSal+"\nTravel Allowance: "+TA+
				"\nTotal Salary: "+TotalSal+"\nAnnual Salary: "+AnnualSal);
	}
}
public class Employee_Details {
	public static void main(String[] args)
	{
		int id,basicSal,n,i;
		String name,designation;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Employees: ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("==========================================");
			System.out.println("Enter Employee "+i+" Details : ");
			System.out.print("Enter id : ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name : ");
			name = sc.nextLine();
			System.out.print("Enter designation : ");
			designation = sc.nextLine();
			System.out.print("Enter basic salary : ");
			basicSal = sc.nextInt();
			
			Employee emp = new Employee();
			emp.acceptDetails(id, name, designation, basicSal);
			
		}
		sc.close();
	}
	
}

/*
 OUTPUT:
Enter no. of Employees: 2
==========================================
Enter Employee 1 Details : 
Enter id : 101
Enter name : Nandini
Enter designation : manager
Enter basic salary : 30000
==========================================
******* Employee Details *******
===========================================
ID: 101
Name: Nandini
Designation: manager
Basic Salary: 30000
Travel Allowance: 2000
Total Salary: 32000
Annual Salary: 384000
==========================================
Enter Employee 2 Details : 
Enter id : 102
Enter name : Prathamesh
Enter designation : .NET Developer
Enter basic salary : 35000
==========================================
******* Employee Details *******
===========================================
ID: 102
Name: Prathamesh
Designation: .NET Developer
Basic Salary: 35000
Travel Allowance: 1500
Total Salary: 36500
Annual Salary: 438000

 */