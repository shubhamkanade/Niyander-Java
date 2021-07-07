import java.util.*;

class InsufficientFundException extends Exception
{
	InsufficientFundException(String msg)
	{
		System.out.println("\n\n"+msg);
	}
	
}

class SavingAccount
{
	int acno;
	String name;
	float balance;
	
	Scanner sc = new Scanner(System.in);

	SavingAccount()
	{
		this.acno = 0;
		this.name = null;
		this.balance = 500;
	}
	
	SavingAccount(int acno,String name,float balance)
	{
		this.acno = acno;
		this.name = name;
		this.balance = balance;

	}

	void withdraw() throws InsufficientFundException
	{
		int acno2;		
		String name2;		
		float amount;		
				
		System.out.printf("Enter Acno\n\n");
		acno2 = sc.nextInt();
		System.out.printf("Enter name\n\n");
		name2 = sc.next();
		
		if(acno == acno2 && name.equals(name2))
		{
				System.out.printf("\n\nEnter the amount to withdraw\n\n");
				amount = sc.nextFloat();
				
				if(balance - amount < 500)
				{
					throw new InsufficientFundException("Paisa nahi milega balance 500 ke niche jara");
				}
				else
				{
					balance -= amount;
					viewBalance();
				}
		}
		else
		{
			throw new InsufficientFundException("Incorrect Account numbre or password");
		}
		
	}
	
	void deposit() throws InsufficientFundException
	{
		float amount;
		
		System.out.printf("Enter the amount to be deposited\n");
		amount = sc.nextFloat();
		
		if(amount < 0 )
		{
			throw new InsufficientFundException("Amount cannot be negative");
		}
		else
		{
			balance += amount;
			viewBalance();
		}		
			
	}	
	
	void viewBalance()
	{
		System.out.println("\n\nBalance is : "+this.balance);
	}

	public static void main(String args[])
	{
		SavingAccount s = new SavingAccount(12345,"Harshal",1000);
		
		try
		{		
			s.withdraw();
			s.deposit();
		}
		catch(InsufficientFundException e)
		{
			
		}
	}	
}
