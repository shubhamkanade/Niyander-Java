import java.util.*;
import java.io.*;

class InvalidDateException extends Exception
{
	{
		System.out.println("the date is invalid");
	}
}
class Date
{
	Scanner s=new Scanner(System.in);
	int day,month,year;
	void accept()
	{
		System.out.println("enter the day");
		day=s.nextInt();
		System.out.println("enter the month");
		month=s.nextInt();
		System.out.println("enter the year");
		year=s.nextInt();
		checkDate();

	}
	void checkDate()
	{
		try
		{
			if((day>0)&&(day<31)&&(month>0)&&(month<13)&&(year>0))
			{
			}
			else
			{
			
			
				throw new InvalidDateException();
			}
		}
		catch(InvalidDateException e)
		{
			System.out.println(e);
		}
	}
	void display()
	{
		System.out.println("the day is : "+day+" the month is : "+month+" the year is : "+year);
	}
	public static void main(String arg[])
	{
		Date d=new Date();
		d.accept();
		d.display();
	}
}

















