import java.io.*;
class Vargs
{
	static int max(int ...x)
	{
		int iMax=x[0];

		for(int i=0;i<x.length;i++)
		{
			if(x[i]>iMax)
				iMax=x[i];
		}
		return iMax;
	}
	public static void main(String arg[])
	{
		int arr1[]={10,20,30};
		int iResult=Vargs.max(arr1);
		System.out.println("The max is : "+iResult);

		int arr2[]={4,7,5};
		iResult=Vargs.max(arr2);
		System.out.println("The max is : "+iResult);

		int arr3[]={10,30};
		iResult=Vargs.max(arr3);
		System.out.println("The max is : "+iResult);

	}
}

