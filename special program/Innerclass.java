import java.lang.*;
import java.io.*;

//this is an outer class
class Bankacct
{
	private double bal;
	Bankacct(double b)
	{
		this.bal=b;
	}
	void contact(double r)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password");
		String passwd=br.readLine();
		if(passwd.equals("xyz123"))
		{
			Interest in=new Interest(r);
			in.calculateInterest();
		}
		else
		{
			System.out.println("Sorry,you are not an authorized person");
			return;
		}
	}
	//INNER CLASS 
	private class Interest
	{
		private double rate;
		Interest(double r)
		{
			rate=r;
		}
		void calculateInterest()
		{
			double interest=bal*rate/100;
			bal+=interest;
			System.out.println("Updated balance = "+bal);
		}
	}
}
class Innerclass
{
	public static void main(String arg[])throws Exception
	{
		Bankacct account=new Bankacct(10000);
		account.contact(9.5);
	}
}

