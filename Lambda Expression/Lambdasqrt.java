import java.io.*;
class Lambdasqrt
{
	interface Myinter
	{
		double squareRoot(double num);
	}
	public static void main(String arg[])
	{
		Myinter m=(double x) ->{return Math.sqrt(x);};

		System.out.println("The square root of 256 is = "+m.squareRoot(256));
	}
}

