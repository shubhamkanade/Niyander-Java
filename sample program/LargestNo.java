import java.lang.*;
import java.io.*;
import java.util.*;

class LargestNo
{
	public static void main(String arg[])throws Exception
	{
		int iSize=0,iRet=0;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter n elements");
		iSize=Integer.parseInt(br.readLine());

		int arr[]=new int[iSize];

		System.out.println("Enter the elements");
		for(int iCnt=0;iCnt<iSize;iCnt++)
		{
			arr[iCnt]=Integer.parseInt(br.readLine());
		}

		Hello obj=new Hello();
		iRet=obj.Maximum(arr);
		System.out.printf("The max no is %d ",iRet);
	}
}
class Hello
{
	public int Maximum(int arr[])
	{
		int iMax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>iMax)
				iMax=arr[i];
		}
		return iMax;
	}
}
















