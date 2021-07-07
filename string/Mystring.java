import java.lang.*;
import java.io.*;
import java.util.*;

class Demo
{
	public String[] remove(String str,String word)
	{
		String arr[]=str.split("\\s");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(word))
				arr[i]=arr[i].replaceAll(arr[i],"");
		}
		return arr;
	}

}
class Mystring
{
	public static void main(String main[])
	{
		Scanner s=new Scanner(System.in);
		Demo d=new Demo();
		System.out.println("ENter your string");
		String name=s.nextLine();
		String arr[];
		System.out.println("ENter your word to replace");
		String word=s.nextLine();

		arr=d.remove(name,word);

		System.out.println("After removing");
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);	

		//d.remove(name,word);
		//System.out.println(name);


	}
}
