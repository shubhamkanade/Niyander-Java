import java.lang.*;
import java.io.*;
class base
{
	public void fun()
	{
		System.out.println("base fun\n");
	}
	public void gun()
	{
		System.out.println("base gun\n");
	}
}
class derived extends base
{
	public void gun()
	{
		System.out.println("derived gun");
	}
}
class virtual
{
	public static void main(String arg[])
	{
		base bobj=new base();
		derived dobj=new derived();

		base bobj2=new derived();
		bobj.fun();
		bobj.gun();
		
		dobj.fun();
		dobj.gun();
		bobj2.fun();
		bobj2.gun();

	}
}
