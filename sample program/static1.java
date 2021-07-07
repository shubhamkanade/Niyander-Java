import java.lang.*;
import java.io.*;

class demo
{
	public demo()
	{
		System.out.println("inside constructor");
	}
}
class static1
{
static
{

System.out.println("inside static");
}

	public static void main(String arg[])
	{
		System.out.println("inside main");
		demo obj=new demo();
	/*	static
		{
			System.out.println("inside static");
		}*/
	}
}
