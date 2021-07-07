import java.lang.*;
import java.io.*;

class demo
{
	private int n;
	demo() //default constructor
	{
		n=0;
	}
	demo(int i) //parameterized constructor
	{
		n=i;
	}
	void isNegative()
	{
		if(n<0)
			System.out.println("no is negative");
		else
			System.out.println("no is positive");
	}
	void isPositive()
	{
		if(n>0)
			System.out.println("no is positive");
		else
			System.out.println("no is negative");
	}
	void isZero()
	{
		if(n==0)
			System.out.println("no is equal to zero");
		else
			System.out.println("no is not equal to zero");
	}
	void isEven()
	{
		if(n%2==0)
			System.out.println("no is even");
		else
			System.out.println("no is odd");
	}
}
class setb2
{
	public static void main(String arg[])
	{
		demo dobj=new demo(Integer.parseInt(arg[0]));
				dobj.isPositive();
				dobj.isNegative();
				dobj.isZero();
				dobj.isEven();
				}
				}





















