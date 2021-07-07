import java.lang.*;
import java.util.*;
interface CreditCardInterface
{
	void viewCreditAmount();
	void useCard();
	void payCredit();
	void increaseLimit();
}
class SilverClassCustomer implements CreditCardInterface
{
	Scanner s=new Scanner(System.in);
	public String name,cardnumber;
	protected int creditamount=0,creditlimit=50000;
	public void Accept()
	{
		System.out.println("Enter name");
		name=s.next();
		System.out.println("enter card number 16 digits");
		do
		{
			cardnumber=s.next();
			if(cardnumber.length()!=16)
				System.out.println("invalid card number");
		}while(cardnumber.length()==16);
	}
	public void viewCreditAmount()
	{
		System.out.println("The credit limit is "+creditlimit);
	}
	public void useCard()
	{
		double amount=0.0;
		System.out.println("Enter the amount to add");
		amount=s.nextDouble();
		if((creditamount+amount)<creditlimit)
		{
			creditamount+=amount;
		}
		else
			System.out.println("limit exceeds");
	}
	public void payCredit()
	{
		double amount=0.0;
		System.out.println("Enter the amount to reduce");
		amount=s.nextDouble();
		if((creditamount-amount)>0)
			creditamount-=amount;
		else
			System.out.println("no money avaialble");


	}
	public void increaseLimit()
	{
		System.out.println("this offer is not for silver cards");
	}
}
class GoldClassCustomer extends SilverClassCustomer
{
	public GoldClassCustomer() //default constructor
	{
		super.creditlimit=100000;
	}
	public void increaseLimit()
	{
		int count=0;
		double amount=0.0;
		if(count<3)
		{
			System.out.println("Enter the amonut to add");
			amount=s.nextDouble();
			if(amount<5000)
				creditlimit+=amount;
		}
	}
}
class Card
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter card type 1:silver 2:gold" );
		int n=s.nextInt();
		switch(n)
		{
			case 1:SilverClassCustomer s1=new SilverClassCustomer();
			       break;
			case 2:GoldClassCustomer g=new GoldClassCustomer();
			       break;
		}
	}
}










