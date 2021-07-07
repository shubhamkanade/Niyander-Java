import java.lang.*;
import java.util.*;
class my extends Throwable
{
	{
		System.out.println("the date is invalid"); 
	}
}
class date
{
	int day,date,year;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("enter the day");
		day=sc.nextInt();
		/*try()
		  {
		  if((day>0)&&(day<31)&&(month>0)&&(month<13)&&(year>0))
		  {
		  }
		  else
		  {	
		  throw new my();
		  }	
		  catch(Exception e)
		  {
		  System.out.println(e);
		  }*/

		System.out.println("enter date");
		date=sc.nextInt();
		System.out.println("enter the year");
		year=sc.nextInt();
		checkdate();
	}
	void checkdate()
	{		
		try
		{
			if((day>0)&&(day<31)&&(date>0)&&(date<13)&&(year>0))
			{
			}
			else
			{
				throw new my();
			}
		}
		catch(my e)
		{
			System.out.println(e);
		}

	}

	
	void display()
	{
		System.out.println("the day is\t"+day+"the date is\t"+date+"the year is\t"+year);
	}
}
class myclass
{
	public static void main(String arg[])
	{
		date d=new date();
		d.accept();
		//d.checkdate();
		d.display();
	}
}

