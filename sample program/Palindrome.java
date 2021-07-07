import java.lang.*;
import java.io.*;

class Palindrome
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  a string");
		String str=br.readLine();

		String temp=str;
		StringBuffer sb=new StringBuffer(str);

		sb.reverse();

		str=sb.toString();

		if(str.equals(temp))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
	}
}
