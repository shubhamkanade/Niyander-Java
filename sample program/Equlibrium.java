import java.lang.*;
import java.io.*;

class Equlibrium
{
	public static void main(String arg[])
	{
		int arr[]={7,6,2,7,10,2,-3,6};

		int sum=0,leftsum=0;
		int j=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];

		for(j=0;j<arr.length;j++)
		{
			sum=sum-arr[j];
			if(leftsum==sum)
				break;
			leftsum+=arr[j];
		}
		if(j==arr.length)
			System.out.println("there is no equlibrium index");
		else
			System.out.println("equlibrium index is at "+j);
	}
}
