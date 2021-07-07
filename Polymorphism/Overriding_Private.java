/* We cannot override private methods bcoz private methods caanot access outside the class*/
import java.io.*;
import java.lang.*;
class Base
{
	private void fun()
	{
		System.out.println("In Base Fun");
	}
}
class Derived extends Base
{
	void fun()
	{
	System.out.println("Derived fun");
	}
}
class Overriding_Private
{
	public static void main(String arg[])
	{
		Derived d1=new Derived();
		Base b1=new Base();
		Base b2=new Derived();
	//	b1.fun();
		d1.fun();
		b2.fun();
	}
}

