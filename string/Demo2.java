import java.util.*;
import java.io.*;

class Mystring
{
	public int length(String str)
	{

		int max=0,i=0;
		String arr[]=str.split("\\s");

		for(i=0;i<arr.length;i++)
			if(arr[i].length()>max)
				max=arr[i].length();


		return max;
	}
}
class Demo2
{
	public static void main(String arg[])
	{
		Mystring m=new Mystring();
		Scanner s=new Scanner(System.in);
		System.out.println("ENter string");
		String str=s.nextLine();
		int max=m.length(str);
		System.out.println("The length of maximum word is "+max);
	}
} 
