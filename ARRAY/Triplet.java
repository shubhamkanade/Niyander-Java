import java.lang.*;
import java.io.*;
import java.util.*;
class Demo
{
	private int arr[];

	public Demo(int iSize)
	{
		arr=new int[iSize];
	}
	public void Accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
	}
	public void Display()
	{
		System.out.println("Elements are");
		for(int i:arr)
			System.out.println(i);
	}
	public void searchTriplet()
	{
		int a=0,b=0,c=0;
		System.out.println("elements are");
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				for(int k=0;k<arr.length;k++)
				{
					a=arr[i]*arr[i];
					b=arr[j]*arr[j];
					c=arr[k]*arr[k];
					if((a==b+c)||(b==a+c)||(c==a+b))
						System.out.println(a+" "+b+" "+c);
				}
			}
		}
	}
}
class Triplet
{
	public static void main(String arg[])
	{
		Demo d=new Demo(10);
		d.Accept();
		d.Display();
		d.searchTriplet();
	}
}
