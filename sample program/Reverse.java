import java.lang.*;
import java.util.*;

class Reverse
{
	public static void main(String arg[])
	{
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		str=s.nextLine();
		str=strrev(str);
		System.out.println("The reverse string is "+str);
	}
	public static String strrev(String str)
	{
		int i=0,j=0;
		char iTemp;
		char arr[]=str.toCharArray();
		System.out.println("The string is : "+str);
		for(i=0,j=arr.length-1;i<j;i++,j--)
		{
			iTemp=arr[i];
			arr[i]=arr[j];
			arr[j]=iTemp;
		}
		String newptr=new String(arr);
		return newptr;
		



	}

}
