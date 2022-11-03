package basicpackage;

public class IncrementDecrementOpr {
	public static void main(String[] args)
	{
		//pre-increment
		int x=10,y;
		System.out.println("Value of x = "+x);
		y=++x;
		System.out.println("After pre-increment Value of x = "+y);
		
		//post-increment
		int a=10,b,c;
		System.out.println("Value of a = "+a);
		b=a++;
		//c=b+y;
		System.out.println("After post-increment Value of a = "+b);
		//System.out.println("Sum= "+c);
		
		//pre-decrement
		int p=10,q;
		System.out.println("Value of p = "+p);
		q=--p;
		System.out.println("After pre-decrement Value of p = "+q);
		
		//post-decrement
		int m=10,n;
		System.out.println("Value of m = "+m);
		n=m--;
		System.out.println("After post-decrement Value of m = "+n);
				
	}
}
