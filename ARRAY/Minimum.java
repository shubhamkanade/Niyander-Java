import java.lang.*;
import java.io.*;
import java.util.*;
class Demo
{
	private int arr[][];
 	private int row,col;
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  Scanner s=new Scanner(System.in);

	public Demo(int iNo1,int iNo2)
	{
		Scanner s=new Scanner(System.in);
		row=iNo1;
		col=iNo2;
		arr=new int[row][col];
	}
	public void Accept()  
	{
		System.out.println("Enter elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
	}
	public void Display()
	{
		System.out.println("Elements are");;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void Min()
	{
		int iMin=0;
		System.out.printf("the minimum number  from each row is\n");
		for(int i=0;i<row;i++)
		{
			iMin=arr[i][0];
			for(int j=1;j<col;j++)
			{
				if(arr[i][j]<iMin)
					iMin=arr[i][j];
			}
			System.out.println(iMin);
		}
	}
}
class Minimum
{
	public static void main(String arg[])  throws Exception
	{
		Demo dobj=new Demo(3,4);
		dobj.Accept();
		dobj.Display();
		dobj.Min();
	}
}
