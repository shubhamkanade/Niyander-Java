import java.lang.*;
import java.io.*;

class base //base or super class
{
	public int i = 10;
	void fun()
	{
		System.out.println("In Base Gun");
	}
}
class derived extends base  // derived class or sub class
{
	public int j=20;
	void gun()
	{
		System.out.println(super.i);
		System.out.println("In Derived Gun");
	}
}
class sl
{
	public static void main(String arg[])
	{
		derived d=new derived();
		d.gun();
		d.fun();
		System.out.println(d.j);
	}
}


