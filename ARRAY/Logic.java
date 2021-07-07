import java.util.*;
import java.io.*;

class Demo
{
	public void MaxFrequency(String str)
	{

		String arr[]=str.trim().split("\\s+");

		HashMap <String,Integer> hobj=new HashMap();

		for(String word:arr)
		{
			if(hobj.containsKey(word))
			{
				hobj.put(word,hobj.get(word)+1);
			}
			else
			{
				hobj.put(word,1);
			}
		}
		//System.out.println(hobj);
		Set <String> sobj=hobj.keySet();
		int iMax=0;
		String Maxstr=null;
		for(String input:sobj)
		{
			if(iMax<hobj.get(input))
			{
				iMax=hobj.get(input);
				Maxstr=input;	
			}
		}	
	System.out.println("Maximum occured word "+Maxstr+"\n"+"It's frequency is "+iMax);
	}
}
class Logic
{
	public static void main(String arg[])
	{
		Demo d=new Demo();
		d.MaxFrequency("abc pqr abc pqr xyz lmn adc");
		
	}
}

