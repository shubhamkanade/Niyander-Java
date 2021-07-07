import java.lang.*;
import java.lang.*;
import java.io.*;
import java.util.*;
class Dimesion1
{
	public static void main(String arg[])
	{
		int arr[];
		int iSize;

		System.out.println("Enter the no of elemensts");
		Scanner s=new Scanner(System.in);
		iSize=s.nextInt();

		arr=new int[iSize];

		System.out.println("ENter the elemets\n");
		for(int i=0;i<iSize;i++)
		{
			arr[i]=s.nextInt();
		}
		                System.out.println("the elemets are\n");
                for(int i=0;i<iSize;i++)
                {
                        System.out.println(arr[i]);
                }
		//no need to deallocate as jvm uses garbage collector

	}
}

import java.io.*;
import java.util.*;
class Dimesion1
{
	public static void main(String arg[])
	{
		int arr[];
		int iSize;

		System.out.println("Enter the no of elemensts");
		Scanner s=new Scanner(System.in);
		iSize=s.nextInt();

		arr=new int[iSize];

		System.out.println("ENter the elemets\n");
		for(int i=0;i<iSize;i++)
		{
			arr[i]=s.nextInt();
		}
		                System.out.println("the elemets are\n");
                for(int i=0;i<iSize;i++)
                {
                        System.out.println(arr[i]);
                }
		//no need to deallocate as jvm uses garbage collector

	}
}

