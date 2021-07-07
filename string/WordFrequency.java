import java.lang.*;
import java.util.*;

class WordFrequency
{
	public static void main(String arrg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");

		String str=s.nextLine();
		System.out.println("Enter word");
		String word=s.next();

		int no=Frequency(str,word);
		System.out.printf("the word count is %d\t",no);

	}
	public static int Frequency(String str,String word)
	{
		String arr[]=str.split(" ");
		int iCnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!arr[i].equals(""))
			{	

				if(arr[i].equals(word))
				{
					iCnt++;
				}

			}
		}
		return iCnt;
	}

}

