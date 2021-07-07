import java.lang.*;
import java.io.*;

class CharArrayCount
{
	public static void main(String arg[])
	{
		String str="hello world";
		char ch='l';

		char arr[]=str.toCharArray();

		int iCnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
				iCnt++;
		}
		System.out.println("no of characters "+iCnt);
	}
}
