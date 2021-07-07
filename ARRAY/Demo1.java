import java.lang.*;
import java.io.*;
class Demo1 
{ 
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n elements");
		int iSize=Integer.parseInt(br.readLine());
		int arr[]=new int[iSize];
		System.out.println("Enter elements");
		for(int i=0;i<iSize;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		Equ.findIndex(arr);
	}
}
class Equ
{
	public static void findIndex(int arr[])
	{
		int leftsum=0,rightsum=0,i=0;

		for(i=0;i<arr.length;i++)
		{
			leftsum=0;rightsum=0;
			for(int j=0;j<i;j++)
			{
				leftsum=leftsum+arr[j];
			}
			for(int k=i+1;k<arr.length;k++)
			{
				rightsum=rightsum+arr[k];
			}
			if(leftsum==rightsum)
				break;
		}
		if(i==arr.length)
			System.out.println("equalibrium index not found");
		else
			System.out.println("equalibrium index found at "+i);
	}
}





































