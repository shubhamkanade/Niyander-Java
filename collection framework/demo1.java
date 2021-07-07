import java.lang.*;
import java.io.*;
import java.util.*;

class demo1
{
	public static void main(String a[])
	{
		Hashtable obj=new Hashtable();

		//System.out.println(obj.get("marvellous"));
		obj.put(10.0,"marvellous");
		obj.put("avaya",30.0);
		obj.put("marvellous","40.0");
		//System.out.println(obj);

		Enumeration eobj=obj.keys();
		while(eobj.hasMoreElements())
		{
			System.out.println(eobj.nextElement());

		}
	}
}
