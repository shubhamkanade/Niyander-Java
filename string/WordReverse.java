import java.lang.*;
import java.io.*;
import java.util.*;

class Demo
{

	public String WordRev(String str)
	{
		String arr[]=str.trim().split("\\s+"); //regular expression

		StringBuffer Finalstr=new StringBuffer(str.length());
		StringBuffer temp=null;
		for(int i=0;i<arr.length;i++)
		{
			temp=new StringBuffer(arr[i]);
			Finalstr.append(temp.reverse().append(" "));
		}	
		return Finalstr.toString().trim();
	}
}
class WordReverse
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		Demo d=new Demo();
		System.out.println("ENter string");
		String input=s.nextLine();
		String ret=d.WordRev(input);
		System.out.println("The reverse string is "+ret);	
	}
}
