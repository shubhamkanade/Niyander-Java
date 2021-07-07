import java.lang.*;
import java.io.*;

class MyClass
{
	static void method()
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught and Rethrown");
			//throw e;
		}
	}
}
class ExceptionDemo1
{
	public static void main(String arg[])
	{
			try
	{
			MyClass.method();
	}	
	catch(Throwable e)
		{
			System.out.println("Caught in main "+e);
		}
	}
}

