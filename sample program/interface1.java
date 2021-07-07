import java.lang.*;
import java.io.*;
interface demo
{
	int i=11;
	 void fun();
	void gun();
}
class hello implements demo
{
public void fun()
	{
	}
public void gun()
	{
	}
}
class interface1
{
	public static void main(String arg[])
	{
	//	demo obj=new demo();
		demo obj=new hello();
		hello hobj=new hello();
		System.out.println(hobj.i);



	}
}

















