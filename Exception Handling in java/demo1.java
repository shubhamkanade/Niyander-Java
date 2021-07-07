import java.lang.*;
import java.io.*;

class throws1
{
	public void fun() throws Exception
	{
		//code
	}
}
class demo1
{
	public static void main(String arg[]) 
	{
		throws1 th=new throws1();
		try
		{
			th.fun();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
