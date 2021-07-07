import java.lang.*;
import java.io.*;
import java.util.*;
class InvalidDateException extends Throwable
{
	{
		System.out.println("Date is invalid");
	}
}
class Date
{
	
	public int day,month,year;
	Scanner s=new Scanner(System.in);
	public void Accept()
	{
		System.out.println("Enter the date in the form of (dd,mm,yy)");
		day=s.nextInt();
		month=s.nextInt();
		year=s.nextInt();
		checkDate();
	}
	public void checkDate()
	{
		try
		{
			if((day==0 || day>32)||(month==0 || month>13 ))
			{
				throw new InvalidDateException();
			}
		}
		catch(InvalidDateException i)
		{
			System.out.println(i);
		}
	}


	public void Display()
	{
		System.out.println("The day is "+day+"\nThe month is "+month+"\nThe year is "+year);
	}
	public static void main(String arg[])
	{
		Date d=new Date();
		d.Accept();
		d.Display();
	}
}

