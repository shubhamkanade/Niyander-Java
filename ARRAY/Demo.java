import java.lang.*;
import java.io.*;
import java.util.*;

class Matrix
{
	public int row,col;
	public int arr[][];
	public Matrix()
	{	
	}
	public Matrix(int value1,int value2)
	{
		row=value1;
		col=value2;
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
		System.out.printf("The elements are\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public Matrix Add(Matrix op1,Matrix op2)
	{
		if((op1.row!=op2.row)||(op2.row!=op2.row))
		return null;//we can use return in filter but not in directly loop
		Matrix temp=new Matrix(op1.row,op1.col);
		for(int i=0;i<op1.row;i++)
		for(int j=0;j<op1.col;j++)
		temp.arr[i][j]=op1.arr[i][j]+op2.arr[i][j];
		System.out.println();
		return temp;
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Matrix obj1=new Matrix(3,3);
		Matrix obj2=new Matrix(3,3);
		Matrix obj3=new Matrix();
		obj1.Accept();
		obj2.Accept();

		System.out.println("Elements of 1 st matrix is ");
		obj1.Display();
		System.out.println("Elements of 2 st matrix is ");
		obj2.Display();

		System.out.println("the addition is");
		Matrix result=obj3.Add(obj1,obj2);
		result.Display();

	}
}






