import java.lang.*;
import java.io.*;
class Demo1
{
	public static void main(String arg[]) throws Exception
	{
		int iSize=0,iRet=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("enter the size of elemst");



iSize=Integer.parseInt(br.readLine());
		//System.out.println("enter the size of elemst");
		int arr[]=new int[iSize];

		System.out.println("enter the elements");
		for(int i=0;i<iSize;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		Hello hobj=new Hello();
		iRet=hobj.max(arr);
		System.out.printf("the maximum element is from array="+iRet);
	}
}
class Hello
{
	public int max(int arr[]) //there is no need to take size variable as paramet		
		{
		int iMax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>iMax)
			{
				iMax=arr[i];
			}
			
		}
		return iMax;
	}


}





















