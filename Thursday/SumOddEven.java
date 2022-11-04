package basicpackage;
import java.util.Scanner;

public class SumOddEven {
	public static void main(String[] args)
	{
		int i,n,EvenSum=0,OddSum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Range : ");		
		n = scan.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				EvenSum+=i;
			}
			else
			{
				OddSum+=i;
			}
		}
		System.out.println("Sum of even numbers from 1 to "+n+" : "+EvenSum);
		System.out.println("Sum of odd numbers from 1 to "+n+" : "+OddSum);
		scan.close();
	}
}
