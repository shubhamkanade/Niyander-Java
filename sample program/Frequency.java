import java.lang.*;
import java.io.*;


//input:- abc_xyz_pqr_xyz_ab_xy_xyz ,xyz
//output:- 3

class Frequency
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str,ptr;
		System.out.println("Enter String");
		str=br.readLine();
		 System.out.println("Enter Word");
		ptr=br.readLine();
		int iCount=Frequency(str,ptr);
		System.out.println("The count is "+iCount);

	}
	public static int Frequency(String str,String word) //method is static due to which we can call directly i.e without using object
	{
		int iCnt=0;
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(word))
				iCnt++;
		}
		return iCnt;

		

	}
}

