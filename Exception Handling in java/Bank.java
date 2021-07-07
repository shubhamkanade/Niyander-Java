import java.util.*;
import java.lang.*;
class InsuffientFundsException extends Throwable
{
	{
		System.out.println("Balance is insuffient");
	}
}

class SavingAccount
{
	Scanner s=new Scanner(System.in);
	public long acno;
	public String name;
	public int balance;
	public SavingAccount()
	{
		acno=0;
		name=null;
		balance=0;
	}
	public SavingAccount(long acno,String name,int balance)
	{
		this.acno=acno;
		this.name=name;
		this.balance=balance;
	}
	public void viewBalance()
	{
		System.out.println("The balance is "+balance);
	}
	public void withDraw()
	{
		Scanner s=new Scanner(System.in);
		int amount;
		String name1;
		System.out.println("Enter the account number");
		int acno1=s.nextInt();
		System.out.println("enter the name");
		name1=s.next();
		if(name1.equals(name) && acno1==acno)
		{
			try
			{
				System.out.println("Enter the amount to withdraw");
				amount=s.nextInt();
				if(balance-amount<500)
				{
					throw new InsuffientFundsException();
				}
				else
					balance-=amount;
			}
			catch(InsuffientFundsException i)
			{		
				System.out.println(i);
			}
		}
		else
			System.out.println("Information is not correct");

	}
	public void deposit()
	{
		int amount=0;
		System.out.println("Enter the amount to deposit");
		amount=s.nextInt();
		if(amount!=0)
		{
			balance+=amount;
		}
	}
}
class Bank
{
	public static void main(String arg[])
	{
		SavingAccount sa=new SavingAccount(3343121,"saurabh",10000);
		sa.viewBalance();
		sa.withDraw();
		sa.deposit();
	}
}





