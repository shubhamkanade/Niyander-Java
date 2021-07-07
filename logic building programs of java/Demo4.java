import java.lang.*;
import java.util.*;
import java.io.*;

class matrix
{
	public int row,col;
	public int arr[][];

	public matrix(int value1,int value2) //parameterized consrtuctor
	{
		this.row=value1;
		this.col=value2;
		arr=new int[row][col];
	}
	public void accept()
	{
		

//Scanner s=new Scanner(System.in);
		System.out.println("enter the elemets");
Scanner s=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
	}
	public void display()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
class operation
{
	public matrix add(matrix op1,matrix op2) //where matix is the return value
	{
		if((op1.row!=op2.row)||(op2.col!=op2.col))
		{
			return null;
		}
		matrix temp=new matrix(op1.row,op1.col); //object of matrix object
		for(int i=0;i<op1.row;i++)
		{
			for(int j=0;j<op1.col;j++)
			{
				temp.arr[i][j]=op1.arr[i][j]+op2.arr[i][j];
			}
		}
		return temp;
	}
}
class Demo4
{
	public static void main(String arg[]) 
	{
		matrix mobj1=new matrix(2,2);
		matrix mobj2=new matrix(2,2);

		mobj1.accept();
		mobj2.accept();

		System.out.println("1st matrix");
		mobj1.display();
		System.out.println("2nd matrix");
		mobj2.display();
		operation oobj=new operation();
		matrix result=oobj.add(mobj1,mobj2);//we are returning matrix claas object
		System.out.println("additon of marix is");
		result.display();
	}

}









