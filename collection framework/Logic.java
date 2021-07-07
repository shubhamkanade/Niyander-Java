import java.lang.*;
import java.io.*;
import java.util.*;
class Logic
{
	public static void Frequency(int arr[]) throws Exception
	{
		HashMap <Integer,Integer> hobj;
		hobj=new HashMap();
		for(int no:arr)
		{
			if(hobj.containsKey(no))
				hobj.put(no,hobj.get(no)+1);
			else //if element is new
				hobj.put(no,1);	
		}
		System.out.println("All elements and its frequency");
		System.out.println(hobj);
		hobj=null;
	}
	public static void main(String arg[]) throws Exception
	{
		int arr[]={11,17,11,20,11,21,17};
			Frequency(arr);
		
			//System.out.println(e);

	}
}
