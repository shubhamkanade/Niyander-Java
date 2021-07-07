import java.lang.*;
import java.io.*;
import java.util.*;
class Word
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter string");
		String str=s.nextLine();

		String arr[]=str.split("\\s");
		//String ptr;
		for(String ptr:arr)
			System.out.println(ptr+"length is "+ptr.length());  //here length is a function
		int iMax=0;
		//System.out.println(arr[0].length);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>iMax) //here we are making string array but array consist of string
			iMax=arr[i].length();
		}
		System.out.println("The max count is "+iMax);	

		

	}
}

