/*
Question: Create a class called People with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class.The other data members of Employee class 
are annualSalary(double), the year the employee started to work, and the national insurance number which is 
a String. Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods.
Write another class called TestEmployee, containing a main method to fully test your class definition. 
*/

package oopsconcept;

public class TestEmployee 
{
	public static void main(String[] args)
	{
		Employee2 emp = new Employee2();
		emp.acceptName();
		emp.acceptDetails();
		emp.displayName();
		emp.display();
	}
}

/*
 OUTPUT:
Enter name: Bobby
Enter annual salary: 450000
Enter Year of joining: 2022
Enter National Insurance Number: GBD4564fHJ456

=========== Employee Details ==========
Name: Bobby
Annual Salary: 450000.0
Year of Joining: 2022
National Insurance Number: GBD4564fHJ456

*/