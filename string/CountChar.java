import java.lang.*;
import java.util.*;

class CountChar
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		System.out.println("Enter a character");
		char ch=s.next().charAt(0);
		int iCnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				iCnt++;
		}
		System.out.println("no of occurences "+iCnt);
	}
}
