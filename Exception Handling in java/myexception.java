//in case of user defined exception we have to extends exception class and we have to call constructor by using superkeyword, we have to also write 2 constructor as default and paramerised


import java.lang.*;
import java.util.*;

class userexception extends Exception
{
	public userexception()
	{
		System.out.println("age is invalid");
	}
	public userexception(String str)
	{
		super(str);
		System.out.println("ge is invalid");
	}
}
class myexception
{
	public static void main(String r[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("enter the age");
		int age=s.nextInt();

		try
		{
			if(age<18)
			{
				userexception u=new userexception();
				throw u;
			}
		}
		catch(userexception e)
		{
			System.out.println(e);
		}

	}
}
