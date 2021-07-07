import java.util.*;
import java.io.*;

class myexception extends Throwable
{
	public myexception()
	{
		System.out.println("in default");
	}
	public myexception(String str)
	{
		super(str);
		System.out.println("age is invalid");
	}
}
class demo5
{
	public static void main(String arg[]) 
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter age");
		int age=sobj.nextInt();
		try
		{
			if(age>18)
			{
				myexception mobj=new myexception("this");
				throw mobj;
			}

		}
		catch(myexception m)
		{	System.out.println(m);
			System.out.println("ecception occured");
		}
	}
}



