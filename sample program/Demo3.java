import java.io.*;

interface Sample
{
	int i=10;
	int j=21;
	Hello hobj=new Hello();
	class Hello
	{
		public int i=10;
	}
}
class Demo3 implements Sample
{
	public static void main(String arg[])
	{	
		Hello hobj1=new Hello();
		System.out.println(hobj1.i);
	}
}
