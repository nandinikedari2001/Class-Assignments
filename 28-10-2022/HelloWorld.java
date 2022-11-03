package basicpackage;

public class HelloWorld {
	public static void main(String[] args ) {
		System.out.println("Welcome to my First Project....");
		byte num = 126;   // range -128 to +127
		short n1 = -32768;  // range -32768 to 32767
		int n2 = 576789058;  // range -2147483648 to 2147483647
		long n3 = 346547687;  //range -9223372036854775808 to 9223372036854775807
		System.out.println("The Integers are : \n"+num+
				"\n"+n1+"\n"+n2+"\n"+n3);
		//System.out.println(num.getClass().getSimpleName());
	
		float n4 = 4557.544f;
		double n5 = 766787.99887;
		System.out.println("The Floating values are : \n"+n4+
				"\n"+n5);
		
		
	}
	
}
