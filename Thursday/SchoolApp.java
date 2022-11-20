/*
 Question: Create a school application with a class called Person. Create name and dateOfBirth as member variables.
 Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.
 Create a class called Student that inherits from Person class. This class will have a member variable called studentId.
 Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying(1st/2nd/3rd/4th).
 Create objects of each of this classes, invoke and test the methods that are available in these classes.
 */

package oopsconcept;
import java.util.Scanner;

class Persons
{
	Scanner sc = new Scanner(System.in);
	String name;
	String dOB;
	
	public Persons(String name, String dOB)
	{
		super();
		this.name = name;
		this.dOB = dOB;
	}
}

class Teacher extends Persons
{
	double salary;
	String subject;
	public Teacher(String name, String dOB,double salary, String subject) 
	{
		super(name, dOB);
		this.salary=salary;
		this.subject=subject;
		
	}
	void display()
	{
		System.out.println("\n=================== Teacher Details ===================");
		System.out.println("Name: "+this.name+"\nDate of Birth: "+this.dOB+
				"\nSalary: "+this.salary+"\nSubject: "+this.subject);
	}
}

class Students extends Persons
{
	int studentId;

	public Students(String name, String dOB,int studentId) 
	{
		super(name, dOB);
		this.studentId=studentId;
	}
}

class CollegeStudent extends Students
{
	String collegeName;
	String year;
	public CollegeStudent(String name, String dOB, int studentId, String collegeName,String year) {
		super(name, dOB, studentId);
		this.collegeName=collegeName;
		this.year=year;
	}	
	
	void display()
	{
		System.out.println("\n=================== Student Details ===================");
		System.out.println("Id: "+this.studentId+"\nName: "+this.name+"\nDate of Birth: "+this.dOB+
				"\nCollege Name: "+collegeName+"\nYear of Study: "+year);
	}
}

public class SchoolApp {
	public static void main(String[] args)
	{
		Teacher obj = new Teacher("Ms.Monalisa","14/12/1980",30000,"Mathematics");
		
		CollegeStudent stud = new CollegeStudent("Bobby","06/01/2000",101,"Samarth College","3rd");
	
		obj.display();
		stud.display();
		
	}
}

/*
 OUTPUT:
 =================== Teacher Details ===================
Name: Ms.Monalisa
Date of Birth: 14/12/1980
Salary: 30000.0
Subject: Mathematics

=================== Student Details ===================
Id: 101
Name: Bobby
Date of Birth: 06/01/2000
College Name: Samarth College
Year of Study: 3rd
 
 */
 