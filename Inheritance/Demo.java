import java.lang.*;
import java.io.*;

class A
{
	public void fun()
	{
		System.out.println("Inside fun A");
	}
}
class B extends A
{
 	protected void fun(int i)
        {
                System.out.println("Inside fun B");
        }
}
class Demo
{
	public static void main(String arg[])
	{
		B bobj=new B();
		bobj.fun();
	}
}	
