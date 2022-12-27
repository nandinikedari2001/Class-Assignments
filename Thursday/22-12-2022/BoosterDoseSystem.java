//Write a code to implement covid vaccination booster doze system. For male if the 
//age is more than 60 and for female if the age is more than fifty and nationality 
//must be Indian then eligible for doze. Else throw custom exception with proper 
//message.


package oopsconcept;

import java.util.Scanner;

public class BoosterDoseSystem 
{
	public static void checkEligibility(int age,String gender,String nationality) 
			throws NotEligibleForBoosterDoseException
	{
		if(nationality.equalsIgnoreCase("Indian"))
		{
			if((gender.equalsIgnoreCase("F") && age>50) || 
					(gender.equalsIgnoreCase("M") && age>60) )
			{
				System.out.println("Congratulations!! You are eligible for Booster Dose.");
			}
			else
			{
				throw new NotEligibleForBoosterDoseException("Unfortunately, You are not eligible for Booster Dose.");
			}
		}
	}

	public static void main(String[] args) 
	{
		int age;
		String gender;
		String nationality;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter 'F' for female and 'M' for male: ");
		gender = sc.nextLine();
		
		System.out.print("Enter your nationality: ");
		nationality = sc.nextLine();
		
		try {
			checkEligibility(age,gender,nationality);
		}
		catch(NotEligibleForBoosterDoseException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		sc.close();
		
	}
}

/*
 OUTPUT:
Scenario 1:
Enter your age: 65
Enter 'F' for female and 'M' for male: M
Enter your nationality: indian
Congratulations!! You are eligible for Booster Dose.

Scenario 2:
Enter your age: 49
Enter 'F' for female and 'M' for male: f
Enter your nationality: indian
Unfortunately, You are not eligible for Booster Dose.
oopsconcept.NotEligibleForBoosterDoseException: Unfortunately, You are not eligible for Booster Dose.
	at corejavaproject/oopsconcept.BoosterDoseSystem.checkEligibility(BoosterDoseSystem.java:25)
	at corejavaproject/oopsconcept.BoosterDoseSystem.main(BoosterDoseSystem.java:48)

 */
