import java.lang.*;
import java.io.*;

class Reverse
{
public static String strReverse(String str)
{
	String arr[]=str.split("\\s+");
	StringBuffer Finalstr=new StringBuffer(arr.length);
	StringBuffer Temp=null;

	for(int i=0;i<arr.length;i++)
	{	
		Temp=new StringBuffer(arr[i]);	
		if(i%2==0)
		{
		Finalstr.append(Temp.reverse().append(" "));
		}
		else
		{
			  Finalstr.append(Temp.append(" "));
		}
		Temp=null;
	}

	return Finalstr.toString().trim();
	
}	
	public static void main(String arg[])
	{
		String Input="ABC PQR LMN";
		System.out.println("The reverse string is "+strReverse(Input));		
	}
}
