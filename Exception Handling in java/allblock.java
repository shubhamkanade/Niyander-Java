//there is no need to write sysytem print at printstacktrace methd

import java.io.*;
import java.lang.*;

class allblock
{
	public static void main(String arg[])
	{
		System.out.println("a");
		try
		{
			System.out.println("b");
		//	System.exit(0);
			int no=50/0;
			//System.exit(0);
			System.out.println("c");
		}
		//System.out.println("d");
		catch(ArithmeticException aobj)
		{
			System.out.println(aobj);
			aobj.printStackTrace();
		}
		    

		finally
		{
			System.out.println("f");
		}
		System.out.println("g");
	}
}

