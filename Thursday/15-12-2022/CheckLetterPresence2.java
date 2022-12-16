//Write a program to check if the word "I" is present in the "I love my India" or not.

package stringexamples;

public class CheckLetterPresence2 
{

	public static void main(String[] args) 
	{
		String str = "I love my India";
		int i;
		char ch = 'I';
		boolean f=false;

		for(i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				f = true;
				break;
			}
		}
		
		if(f==true)
			System.out.println("'"+ch+"' is present in the string "+"'"+str+"'");
		else
			System.out.println("'"+ch+"' is not present in the string "+"'"+str+"'");
	}

}

/*
 OUTPUT:
 'I' is present in the string 'I love my India'
*/