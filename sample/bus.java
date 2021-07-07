import java.lang.*;

class Base
{
	void fun()
	{
		System.out.println("In Base fun");
	}
}

class Derived extends Base
{
	void fun()
	{
		System.out.println("In derived class");
	}	
}

class bus
{
	public static void main(String arg[])
	{
		Base bobj = new Base();
		bobj.fun();
	}
}
