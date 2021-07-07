import java.io.*;

class Lambdasum
{
	interface Myinter
	{
		void add(int a,int b);
	}
	public static void main(String arg[])
	{
		Myinter m=(int a,int b)->System.out.println("Sum is = "+(a+b));
		m.add(4,3);
	}
}

