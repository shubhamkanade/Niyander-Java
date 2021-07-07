import java.io.*;
import java.lang.*;

class ArraySort
{
	public static void main(String arg[])
	{
		int arr[]={10,15,21,99,90,100,95,105,87};
		if(check(arr)==true)
			System.out.println("array is sorted");
		else
			System.out.println("array is not sorted");
	}

	public static boolean check(int arr[])
	{
		//for incresing
		int i=0;
		for( i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]<arr[i])
				break;
		}
		if(i==arr.length-1)
			{
			return true;
			}
		else
		return false;
		//for decresing
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i+1]>arr[i])
				break;
		}*/
	}
}
