/*
 Write a program to input basic salary of an employee and calculate its gross salary according to following:
Basic salary <=10000: HRA=20%,DA=80%
Basic salary <=20000: HRA=25%,DA=90%
Basic salary >20000: HRA=30%,DA=95%
HRA=20%  BS*20/100;
Gross salary: BS+HRA+DA;
*/
package basicpackage;

import java.util.Scanner;

public class GrossSalary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float BS, HRA=0,DA=0,GS;
		System.out.println("Enter Basic Salary: ");
		BS = sc.nextFloat();
		if(BS<=20000)
		{
			HRA = BS*0.2f;
			DA = BS*0.8f;
		}
		else if(BS>20000 && BS<=60000)
		{
			HRA = BS*0.25f;
			DA = BS*0.9f;
		}
		else if(BS>60000)
		{
			HRA = BS*0.3f;
			DA = BS*0.95f;
		}
		GS = BS+HRA+DA;
		System.out.println("Gross Salary = "+GS);
		sc.close();
	}
	
}
