package basicpackage;
import java.util.Scanner;
public class GreaterNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,max;
		System.out.println("Enter three numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
				max=n1;
				//System.out.println(n1+" is greater");
			}
			else
			{
				max=n3;
				//System.out.println(n3+" is greater");
			}
		}
		else
		{
			if(n2>n3)
			{
				max=n2;
				//System.out.println(n2+" is greater");
			}
			else
			{
				max=n3;
				//System.out.println(n3+" is greater");
			}
		}
		System.out.println(max+" is greater");
		sc.close();
	}
}
