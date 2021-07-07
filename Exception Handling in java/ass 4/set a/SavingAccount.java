import java.lang.*;
import java.util.*;
class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String msg)
	{
		System.out.println(msg);
	}
}
	class SavingAccount
	{
		Scanner s=new Scanner(System.in);
		int acno;
		String name;
		double balance;
		public SavingAccount()
		{
			acno=0;
			name=null;
			balance=0.0;
		}
		public SavingAccount(int acno,String name,double balance)
		{
			this.acno=acno;
			this.name=name;
			this.balance=balance;
		}
		void withdraw() throws InsufficientFundsException
		{
			String name1;
			int acno1;
			double amount;

			System.out.println("enter the account number");
			acno1=s.nextInt();
			System.out.println("enter name");
			name1=s.next();
			if(acno==acno1 && name.equals(name1))
			{
				System.out.println("enter the amount to be withdraw");
				amount=s.nextInt();
				if(balance-amount<500)
				{
					throw new InsufficientFundsException("balance is below 500 reupee");
				}
				else
				{
					balance=balance-amount;
					viewBalance();
				}
			}
			else
			{
				System.out.println("information is not correct");
			}
		}
		void deposit() throws InsufficientFundsException
		{
			double amount;
			System.out.println("Enter the amount to be deposit");
			amount=s.nextDouble();
			if(amount<0)
			{
				throw new InsufficientFundsException("balance is below 500 reupee");
			}
			else
				balance+=amount;
			viewBalance();
		}
		void viewBalance()
		{
			System.out.println("the balance is :"+balance);
		}
		public static void main(String arg[])
		{
			SavingAccount s=new SavingAccount(10210,"shubham",500);
			try
			{
				s.withdraw();
				s.deposit();
			}
			catch(InsufficientFundsException e)
			{
			}
		}
	}






































