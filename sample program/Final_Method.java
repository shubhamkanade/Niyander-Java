import java.lang.*;
import java.io.*;
class Demo
{
	final public void fun()
	{
		System.out.println("Demo fun");
	}
	public final void gun()
	{
		System.out.println("demo gun");
	}
}
class Hello extends Demo
{
	/*public void fun()
	{
	}*/
	public void gun(int i)
	{
		System.out.println("Hello gun");
	}
}
class Final_Method
{
	public static void main(String arg[])
	{
		Hello hobj=new Hello();
		hobj.gun();
		hobj.gun(11);
	}
}

