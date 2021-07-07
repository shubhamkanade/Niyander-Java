import java.lang.*;
import java.io.*;
import java.util.*;

class Logic
{
	public void Frequency(int arr[])
	{
		HashMap <Integer,Integer> hobj=new HashMap(); 

		for(int no:arr)
		{
			if(hobj.containsKey(no))
			{
				hobj.put(no,hobj.get(no)+1);	
			}
			else
			{
				hobj.put(no,1);
			}
		}
		System.out.println(hobj);
	}
}
class Mystring
{
	public static void main(String arg[])
	{
		Logic lobj=new Logic();
		Scanner sobj=new Scanner(System.in);

		System.out.println("ENter the size");
		int iSize=sobj.nextInt();

		int arr[]=new int[iSize];
		System.out.println("ENter the elements");

		for(int i=0;i<arr.length;i++)
			arr[i]=sobj.nextInt();
		lobj.Frequency(arr);
	
	}
}
