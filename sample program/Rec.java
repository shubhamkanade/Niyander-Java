import java.lang.*;
import java.io.*;

class Demo
{
	public void PatternI(int iNo)
	{
		for(int i=0;i<iNo;i++)
			System.out.printf("*\t");

	}
	public void PatternR(int iNo)
	{
		if(iNo>0)
		{
			System.out.printf("*");
			iNo--;
			PatternR(iNo);
		}
	}
}
class Rec
{
	public static void main(String arg[])
	{
		Demo dobj=new Demo();
		dobj.PatternI(4);
		dobj.PatternR(5);
	}
}

