import java.lang.*;
import java.util.*;
class Myexception extends Exception
{
	public Myexception()
	{
		System.out.println("age is invalid");
	}
	public Myexception(String str)
	{
		super(str);
		System.out.println("age is invalid");
	}
}
class Demo
{
	public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the age");
	int age=s.nextInt();
	Myexception me=new Myexception();
	try
	{
		if(age<18)
		{	//Myexception me=new Myexception();
			throw me;
		}
	}
	catch(Myexception e)
	{
		System.out.println("Exception handled");
	}
}

}
