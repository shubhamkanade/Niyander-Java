import java.lang.*;
import java.io.*;
abstract class demo
{
	public int sub(int no1,int no2)
	{
		return no1-no2;
	}
	abstract public int add(int no1 ,int no2);
}
class arithematic extends demo
{
	public int add(int no1,int no2)
	{
		return no1+no2;
	}
}
class abstract1
{
	public static void main(String arg[])
	{
			demo d;

		arithematic a=new arithematic();
		demo d2=new arithematic();
	}
}
