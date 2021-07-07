import java.lang.*;
import java.io.*;

class Hello
{
	public static <T> void Display(T arr[])
	{
		for(T no:arr)
			System.out.println(no);
	}
	public static void main(String arg[])
	{
		Integer iArr[]={10,20,30,40};
		//int arr[]={1,2,3,4};
		Character cArr[]={'a','b','c','d'};
		Display(iArr);
		Display(arr);
		Display(cArr);
	}
}

