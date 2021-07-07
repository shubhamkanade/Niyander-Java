import java.lang.*;
import java.io.*;

class Demo
{
	public int i;
	public Demo()
	{
		i=11;
	}
	public Demo(int t)
	{
		i=t;
	}
public void demo()
{
System.out.println("hello");
}
}
// entry point function
class Hello2
{
	public static void main(String abc[])
	{
		Demo obj=new Demo();
		Demo obj1=new Demo(3);
		obj.demo();
	}
}

