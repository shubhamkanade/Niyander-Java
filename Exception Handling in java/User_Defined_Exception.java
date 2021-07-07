import java.lang.*;
import java.io.*;
import java.util.*;

class myexception extends Throwable
{
	public myexception()
	{
		System.out.println("default");
	}
	public myexception(String str)
	{
		super(str);
		System.out.println("age is invalid");
	}
}
class User_Defined_Exception
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int no=s.nextInt();
		try
		{
			if(no<18)
			{
				//myexception m=new myexception("this");
				throw new myexception("this");
			}
		}
		catch(myexception e)
		{
			System.out.println("Exception handled");
		}
	}
}

