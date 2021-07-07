import java.lang.*;
import java.util.*;

class WordReplace
{
	public static String fun(String str)
	{
		String nstring="";
		String arr[]=str.split("\\s+");
		for(String s:arr)
		{
			if(s.equals("you"))
				s="u";
			else if(s.equals("are"))
				s="r";
			//if(!(nstring.equals("null")))
			nstring=nstring+s+" ";
		}
		return nstring;
	}
	public static void main(String arg[])
	{
			System.out.println(fun("How are you"));
	}
}
