import java.lang.*;
import java.io.*;
import java.util.*;

class Sort
{
	public static void main(String arg[])
	{
		int iSize=0,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  N elements");
		iSize=s.nextInt();
		int arr[]=new int[iSize];
		System.out.println("Enter elements");
		for(i=0;i<iSize;i++)
		{
			System.out.println("ENter "+(i+1)+" element");
			arr[i]=s.nextInt();
		}
		if(Check(arr))
			System.out.println("array sorted");
		else
			System.out.println("Array is not sorted");

	}
	public static boolean Check(int arr[])
	{
		int i=0;
		//for increasing
		for(i=0;i<arr.length-1;i++) //here length is property
		{
			if(arr[i+1]<arr[i])
				break;
		}
		if(i==arr.length-1)
			return true;
		else
			return false;

		//for decreasing
		/*for(i=0;i<arr.length-1;i++) //here length is property
		{
			if(arr[i+1]>arr[i])
				break;
		}
		if(i==arr.length-1)
			return true;
		else
			return false;*/
	}
}

