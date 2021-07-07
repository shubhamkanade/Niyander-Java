import java.lang.*;
import java.io.*;

class Generic_Method
{
	public static<T> void printarr(T arr[])
	{
		System.out.println("elments from array");
		for(T value:arr)
		{
			System.out.println(value);
		}
	}
	public static void main(String arg[])
	{
		Integer iarr[]={10,20,30,40};

		Character carr[]={'a','b','c','d'};

		Generic_Method.printarr(iarr);
		Generic_Method.printarr(carr);
	}

}

                   
