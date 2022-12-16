//write a program to find  and the last occurence of the letter 'o' and character ',' in "hello world".

package stringexamples;

public class LastOccurence 
{
	public static void main(String[] args) 
	{
		String str = "Hello World";
		char ch = 'o';
		int i;
		boolean f=false;
		
		for(i=str.length()-1;i>=0;i--)
		{
			if(ch==str.charAt(i))
			{
				f=true;
				break;
			}
		}
		
		if(f==true)
			System.out.println("Last occurence of '"+ch+"' in the string '"+str+"' is at position "+(i+1));
		else
			System.out.println(ch+" is not present in "+str);
	}
}

/*
 OUTPUT:
Last occurence of 'o' in the string 'Hello World' is at position 8
*/