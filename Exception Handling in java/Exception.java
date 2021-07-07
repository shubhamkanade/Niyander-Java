import java.lang.*;
import java.io.*;

class Exception
{
	public static void main(String arg[])
	{
		System.out.println("A");
		try
		{
			System.out.println("B");
			int no=50/0;
			System.out.println("C");
		}
		//System.out.println("D");
		catch(ArithmeticException aobj)
		{
			System.out.println(aobj);
			aobj.printStackTrace();
			//System.exit(0);
		}
		finally
		{
			System.out.println("F");
		}
		System.out.println("g");


	}
}

