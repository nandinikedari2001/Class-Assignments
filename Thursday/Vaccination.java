/*
 Que. Create class vaccine.create 2 concrete method firstDose() and 2ndDose().
Scenario 1:user can take first dose if user is Indian and age is 18.
after vaccination user has to pay 250rs.
Scenario 2: user can take 2nd dose if already the first dose has completed.
Scenario 3: create class Bootstar dose and extend vaccine class.
create static method boosterDose() in class Bootstar dose.
if user has completed dose 1 and dose 2 then they are eligible for booster dose
 */

package oopsconcept;
import java.util.Scanner;

class Vaccine
{
	int age,dose;
	String nationality,name,status;
	float amt;
	
	Scanner sc = new Scanner(System.in);
	
	void getData()
	{
		System.out.print("How many dose(s) you take previously? : ");
		dose = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter age: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter nationality: ");
		nationality = sc.nextLine();
		
		if(age>=18 && nationality.equalsIgnoreCase("indian"))
		{
			if(dose==0)
			{
				System.out.println("You are eligible for First Dose.");
				acceptAmount();
				firstDose();
			}
			else if(dose==1)
			{
				System.out.println("You are eligible for Second Dose.");
				acceptAmount();
				secondDose();
			}

		}
		else
		{
			System.out.println("You are not eligible for Vaccination.");
		}
		sc.close();
		
	}
	void acceptAmount()
	{
		System.out.print("Pay amount(250): ");
		amt = sc.nextInt();
		System.out.println("\nPayment Successful...!");
	}
	
	void firstDose()
	{
			System.out.println("Congratulations...! You are vaccinated with 1st dose.");
			display();
			status="partial";
			System.out.println("Vaccination Status: Partially vaccinated");
	}


	void secondDose()
	{
			System.out.println("Congratulations...! You are vaccinated with 2nd dose.");
			display();
			System.out.println("Vaccination Status: Fully vaccinated");
	}
	void display()
	{
		System.out.println();
		System.out.println("=============== Vaccination Details ==============");
		System.out.println("Name: "+name+"\nAge: "+age+"\nNationality: "+nationality);
	}
}
 
class BoosterDose extends Vaccine
{
	void boosterDose()
	{
		if(dose==2 && age>=18)
		{
			System.out.println("You are eligible for Booster Dose.");
			acceptAmount();
			System.out.println("Congratulations...! You are vaccinated with Booster dose.");
			display();
		}
	}
}

public class Vaccination {
	public static void main(String[] args)
	{
		BoosterDose vc =new BoosterDose();
		vc.getData();
		vc.boosterDose();
	}
}

/*
 OUTPUT:
case 1:
How many dose(s) you take previously? : 0
Enter your name: Nandu
Enter age: 21
Enter nationality: indian
You are eligible for First Dose.
Pay amount(250): 250

Payment Successful...!
Congratulations...! You are vaccinated with 1st dose.

=============== Vaccination Details ==============
Name: Nandu
Age: 21
Nationality: indian
Vaccination Status: Partially vaccinated
 
case 2:
How many dose(s) you take previously? : 1
Enter your name: Bobby
Enter age: 22
Enter nationality: indian
You are eligible for Second Dose.
Pay amount(250): 250

Payment Successful...!
Congratulations...! You are vaccinated with 2nd dose.

=============== Vaccination Details ==============
Name: Bobby
Age: 22
Nationality: indian
Vaccination Status: Fully vaccinated
 */
