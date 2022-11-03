//write a program to calculate total marks of five subjects

package basicpackage;

import java.util.Scanner;

public class Percentage {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int s1,s2,s3,s4,s5,Total;
		float Avg;
		double per;
		
		// Accepting marks of five subjects
		System.out.println("Enter marks of five subjects: ");
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		s3 = scan.nextInt();
		s4 = scan.nextInt();
		s5 = scan.nextInt();
		
		//Calculating sum of 5 subjects
		Total = s1+s2+s3+s4+s5;
		
		//Calculating Average
		Avg = Total/5;
		
		//Percentage of 5 subjects
		per =(Total/500.0)*100;
		
		//Printing Marks and percentage
		System.out.println("Total of 5 subjects: "+Total);
		System.out.println("Average: "+Avg);
		System.out.println("Percentage: "+per+" %");
		
		if(per>=90)
			System.out.println("Grade A+");
		if(80>= per && per <90)
			System.out.println("Grade A");
		if(60>= per &&  per <80)
			System.out.println("Grade B");
		if(40>= per && per <60)
			System.out.println("Grade C");
		if(per >= 35 && 40>per)
			System.out.println("Grade D");
		if(per < 35)
			System.out.println("Grade Fail");
		
		scan.close();
		
	}

}
