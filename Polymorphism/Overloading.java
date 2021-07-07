/* Overriding is compile time polymorphism by using which
   we can write different methods with the same name and differernt prototype
 */
import java.lang.*;
import java.io.*;
class Demo
{
	private void fun(int i)
	{
		System.out.println("In fun1");
	}
	public void fun(int i,int j)
	{
		System.out.println("In fun2");
	}
}
class Overloading
{
	public static void main(String arg[])
	{
		Demo d=new Demo();
		d.fun(10);
		d.fun(10,20);
	}
}

