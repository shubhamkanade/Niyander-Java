import java.lang.*;
import java.io.*;
import java.util.*;
class Matrix
{
	public int iRow,iCol;
	public int arr[][];
	public Matrix(int iValue1,int iValue2)
	{
		iRow=iValue1;
		iCol=iValue2;
		arr=new int[iRow][iCol];
	}
	public void Accept()
	{
		System.out.println("enter the elements\n");
		Scanner sobj=new Scanner(System.in);
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
	}
	public void Display()
	{
		System.out.println("The elements are\n");
		//Scanner sobj=new Scanner(System.in);
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		}
	}
}
class Operation
{

	public Matrix Add(Matrix op1,Matrix op2)
	{
		System.out.println("The addition is\n");
		Matrix temp=new Matrix(op1.iRow,op1.iCol);
		for(int i=0;i<op1.iRow;i++)
		{
			for(int j=0;j<op2.iCol;j++)
			{
				temp.arr[i][j]=op1.arr[i][j]+op2.arr[i][j];
			}
		//	System.out.println("\n");
		}
		return temp;

	}

}
class Demo3
{
	public static void main(String arg[])
	{
		Matrix obj1=new Matrix(3,3);
		Matrix obj2=new Matrix(3,3);
		//int arr[][]=new int[3][3];
		Operation obj=new Operation();
		//Matrix result=new Matrix(3,3);
		obj1.Accept();
		obj2.Accept();
		System.out.println("The matrix of 1st elements are\n");
		obj1.Display();
		System.out.println("The matrix of 2nd elemenst are\n");
		obj2.Display();

		Matrix result=obj.Add(obj1,obj2);
		result.Display();

	}
}

