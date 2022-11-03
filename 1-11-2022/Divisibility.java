package basicpackage;

public class Divisibility {
	public static void main(String []args)
	{
		int a=55;
		if(a%5==0) 
		{
			if(a%11==0)
				System.out.println(a+" is divisible by 5 & 11");
			else
				System.out.println(a+" is divisible by only 5 & not by 11");
		}
		else
		{
			if(a%11==0)
				System.out.println(a+" is divisible by only 11 & not by 5");
			else
				System.out.println(a+" is not divisible by 5 & 11");
		}
	}
}

