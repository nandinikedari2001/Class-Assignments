package oopsconcept;
import java.util.Scanner;

public class Employee2 extends Person2
{
	double annualSalary;
	int year;
	String nationalInsuranceNum;
	
	Scanner sc = new Scanner(System.in);
	
	void acceptDetails()
	{
		System.out.print("Enter annual salary: ");
		annualSalary = sc.nextDouble();
		System.out.print("Enter Year of joining: ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter National Insurance Number: ");
		nationalInsuranceNum = sc.nextLine();
		
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
//	public void setAnnualSalary(double annualSalary) {
//		this.annualSalary = annualSalary;
//	}
	public int getYear() {
		return year;
	}
//	public void setYear(int year) {
//		this.year = year;
//	}
	public String getNationalInsuranceNum() {
		return nationalInsuranceNum;
	}
//	public void setNationalInsuranceNum(String nationalInsuranceNum) {
//		this.nationalInsuranceNum = nationalInsuranceNum;
//	}
	
	void display()
	{
		System.out.println("\nAnnual Salary: "+getAnnualSalary()+"\nYear of Joining: "+getYear()+"\nNational Insurance Number: "+getNationalInsuranceNum());
	}
}
