import java.io.*;
class One
{
	void doSomething()
	{
		System.out.println("hai");;
	}
}
class Two extends One
{
	@Override
		void doSomething()
		{
			System.out.println("hello");;
		}
}
public class Test
{
	public static void main(String arg[])
	{
		Two t=new Two();
		t.doSomething();
	}
}
