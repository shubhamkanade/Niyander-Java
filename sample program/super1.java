import java.lang.*;
import java.io.*;
class base
{
	public int i;
	public base()
	{
		i=11;
	}
	public base(int x)
	{
		i=x;
	}
}
class derived extends base
{
	public int i;
	public derived()
	{
		super(11);
		i=21;
	}
	public derived(int y)
	{
		this();
		this.i=21;
	}
	public void gun()
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		//super.fun();
	}
}
class super1
{
public static void main(String arg[])
{
derived d=new derived();
d.gun();
}
}

























