import java.lang.*;
import java.io.*;

class Genric_method
{
	public static<T> void printarr(T arr[])
	{
		System.out.println("elments from array");
		for(T value:arr)
		{
			System.out.println(value);
		}
	}
}
	Class Hello1
	{
		public static void main(String arg[])
		{
			Integer iarr[]={10,20,30,40};

			Character carr[]={'a','b','c','d'};

			Generic_method.printarr(iarr);
			Generic_method.printarr(carr);
		}
	}

