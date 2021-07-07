mport java.io.*;

class Derived
{
	public int getDetails(String temp)
	{
		System.out.println("Derived class "+temp);
		return 0;
	}
}
public class Test4 extends Derived
{
	public void getDetails(String temp)
	{
		System.out.println("Test class "+temp);
		//return 0;
	}
	public static void main(String arg[])
	{
			Test4 t=new Test4();
			t.getDetails("GIH");
	}
}
