import java.lang.*;
import java.io.*;

class Dir
{
public static void main(String arg[])throws Exception
     
	{
         File f=new File(arg[0]);
	//System.out.println(f.getAbsolutePath());
	String arr[]=f.list();
	for(int i=0;i<arr.length-1;i++)
	 System.out.println(arr[i]);
     }
}
