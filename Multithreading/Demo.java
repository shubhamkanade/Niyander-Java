import java.lang.*;
import java.io.*;
import java.util.*;

class ThreadEven implements Runnable
{
	Myarray mobj;
	int iCnt=0;
	public ThreadEven(Myarray m)
	{
		mobj=m;
	}
	public void run()
	{
	for(int i=0;i<mobj.arr.length;i++)
		{
			   System.out.println("Even number");
			if((mobj.arr[i]%2)==0)
			{
				//System.out.println(mobj.arr[i]);
				iCnt++;
			}
		}
		System.out.println("Even count is : "+iCnt);
	}
}
class ThreadOdd implements Runnable
{
	Myarray mobj;
	int iCnt=0;
        public ThreadOdd(Myarray m)
        {
                mobj=m;
        }

	public void run()
	{
	for(int i=0;i<mobj.arr.length;i++)
                {
			 System.out.println("Odd number");
                        if((mobj.arr[i]%2)!=0)
                        {
                               iCnt++;
                        }
                }
		 System.out.println("Odd count is : "+iCnt);;;;;;;
		
	}
}

class Myarray
{
	public int arr[];

	public Myarray(int isize)
	{
		arr=new int[isize];
	}
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("ENter the elements");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Myarray mobj=new Myarray(8);
		mobj.Accept();
			
		ThreadEven eobj1= new ThreadEven(mobj);	
		ThreadOdd eobj2= new ThreadOdd(mobj);
		
		Thread tobj1=new Thread(eobj1);
		Thread tobj2=new Thread(eobj2);
		
		tobj1.start();
		tobj2.start();
	
	}
}
