import java.lang.*;
import java.io.*;
import java.util.*;

class PrintLeader
{
	public static void printLeader(int arr[])
	{
		int iMax=0;
			System.out.println("Leader Elements are");
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>iMax)
			{
				iMax=arr[i];
				System.out.println(iMax);
			}
		}
	}
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		//int arr[]={6,12,2,9,3,5,7};
		System.out.println("Enter n elements");
		int n=sobj.nextInt();
		System.out.println("ENter elements");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		arr[i]=sobj.nextInt();;
		printLeader(arr);
	}
}
