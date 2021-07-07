import java.util.*;
import java.io.*;
class Search
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many strings");
		int n=Integer.parseInt(br.readLine());

		String s[]=new String[n];

		System.out.println("Enter strings");
		for(int i=0;i<n;i++)
		{
			s[i]=br.readLine();
		}
		System.out.println("Enter the string to serch");
		String name=br.readLine();
		Demo d=new Demo();
		if(d.LinearSearch(s,name)==true)
			System.out.println("element found");
		else
			System.out.println("element not found");
	}
}
class Demo
{
	public boolean LinearSearch(String s[],String name)
	{
		int i=0;
		for(i=0;i<s.length;i++)
		{
			if(s[i].equals(name))
				break;
		}
		if(i==s.length)
			return false;
		else
			return true;
	}
}

