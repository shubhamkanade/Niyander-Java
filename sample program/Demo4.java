import java.lang.*;
import java.io.*;
import java.util.*;

class Demo4
{
	public static void main(String arg[])
	{
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		str=s.nextLine();

		String arr[];
		arr=str.split(" ");
		for(String ptr:arr)
		System.out.println(ptr);
		System.out.println("Count is "+arr.length);
	}
}

