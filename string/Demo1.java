import java.lang.*;
import java.io.*;
import java.util.*;

class Mystring
{
	String str;
	public Mystring(String str)
	{
		this.str=str;
	}

	public String Reverse()
	{
		String s=null;
		String arr[]=str.split("\\s");
		StringBuilder sb=new StringBuilder(arr[0]);
                        s=sb.reverse().toString();
	
		//System.out.println(s);
		for(int i=1;i<arr.length;i++)
		{	
			if(i%2==0)
			{
			sb=new StringBuilder(arr[i]);
			s+=sb.reverse().toString();
			}
			else
			s+=arr[i];
		}
		  return s;

	}
}


class Demo1
{
	public static void main(String arg[])
	{
		String str,str1;
		Scanner s=new Scanner(System.in);
		System.out.println("ENter string");
		str=s.nextLine();
		Mystring m=new Mystring(str);
		str1=m.Reverse();
		System.out.println(str1);
	}
}
