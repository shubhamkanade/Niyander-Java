import java.lang.*;
import java.io.*;

class A
{
	void method1()
	{
		try
		{
			String str="Hello";
			char ch=str.charAt(5);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}
class Rethrow
{
	public static void main(String arg[])
	{
		A obj=new A();
		try
		{
			obj.method1();
		}
		catch(ArithmeticException | StringIndexOutOfBoundsException e)
		{
			System.out.println("i caught rethorwn exception");
		}
	}
}

