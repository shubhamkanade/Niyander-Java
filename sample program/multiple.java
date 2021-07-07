import java.io.*;
import java.util.*;

class multiple
{
	public void Sort(String a[])
	{
		String temp;
		int i=0,j=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
		}
	}
	public static void main(String arg[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number");
		n=s.nextInt();
		
		System.out.println("Enter strings");
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
		//System.out.println(i);
		arr[i]=s.next();
		}
		multiple mobj=new multiple();
		mobj.Sort(arr);

		for(int i=0;i<n;i++)
		System.out.println(arr[i]);


	}
}
