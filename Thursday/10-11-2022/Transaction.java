/*Create a Bank (variable:amount)class to calculate withdraw and deposit.
for withdraw, amount will be given by user.if amount is sufficient then “withdraw successful” will going to print. 
Later on deposit 5000rs in the account balance. 
Ex.:10000 after withdraw 5000,current bal=5000,after deposit 5000 total bal=10000.
*/

package oopsconcept;
import java.util.Scanner;
class Bank
{
	int amount;
	int balanceAmt=20000;
	
	void withdraw(int  amount)
	{
		this.amount=amount;
		if(balanceAmt>amount)
		{
			balanceAmt = balanceAmt-amount;
			System.out.println("Rs."+amount+" successfully withdrawn.");
			displayBalanceAmt();
		}
		else
			System.out.println("Low account balance...! You can withdraw upto Rs."+balanceAmt);
		
	}
	void deposit(int amount)
	{
		this.amount=amount;
		balanceAmt = balanceAmt+amount;
		System.out.println("Rs."+amount+" successfully deposited.");
		displayBalanceAmt();
	}
	void displayBalanceAmt()
	{
		System.out.println("Current Balance Amount : Rs. "+balanceAmt);
	}
}
public class Transaction {
	public static void main(String[] args)
	{
		int ch,amount,balanceAmt=20000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Balance : "+balanceAmt);
		System.out.println("1.Withdraw\n2.Deposit");
		System.out.print("Enter your choice : ");
		ch = sc.nextInt();
		Bank wd = new Bank();
		if(ch==1)
		{
			System.out.print("Enter amount to withdraw: ");
			amount = sc.nextInt();		
			wd.withdraw(amount);
				 
		}
		else if(ch==2)
		{
			System.out.print("Enter amount to deposit: ");
			amount = sc.nextInt();
			wd.deposit(amount);
		}
		else
			System.out.println("Please enter valid choice...");
		sc.close();
		
	}
}

/*
 OUTPUT:
case 1 :
Account Balance : 20000
1.Withdraw
2.Deposit
Enter your choice : 2
Enter amount to deposit: 10000
Rs.10000 successfully deposited.
Current Balance Amount : Rs. 30000

case 2: 
Account Balance : 20000
1.Withdraw
2.Deposit
Enter your choice : 1
Enter amount to withdraw: 12000
Rs.12000 successfully withdrawn.
Current Balance Amount : Rs. 8000

case 3:
Account Balance : 20000
1.Withdraw
2.Deposit
Enter your choice : 1
Enter amount to withdraw: 25000
Low account balance...! You can withdraw upto Rs.20000

case 4:
Account Balance : 20000
1.Withdraw
2.Deposit
Enter your choice : 5
Please enter valid choice...
 */
