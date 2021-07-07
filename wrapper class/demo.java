//all wrapper classes are present in java.util package

import java.util.*;
import java.io.*;
class demo
{
	public static void main(String ar[])
	{
		Integer iobj1=new Integer(101);

		int i=101;

			Integer iobj2=new Integer(i); //boxing
		int ia=iobj2.intValue();
		Integer iobj3=new Integer("101");  //take string as a integer

		int result=iobj1.compareTo(iobj2);
			if(result==0)	
			System.out.println("equal");
		String sobj1=Integer.toBinaryString(iobj1);
		System.out.println(sobj1);
		  String sobj2=Integer.toHexString(iobj1);
                System.out.println(sobj2);

		  String sobj3=Integer.toOctalString(iobj1);
                System.out.println(sobj3);




	}
}


