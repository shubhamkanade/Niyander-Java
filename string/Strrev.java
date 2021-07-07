import java.io.*;
import java.util.*;

class Strrev
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();

		str=strrev(str);
		System.out.printf("the string is %s",str);
	}
	public static String strrev(String str)
	{
		char arr[]=str.toCharArray();

		char temp;
		for(int i=0,j=arr.length;i<j;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}

		String newstr=new String(arr);
		return newstr;
	}





}


