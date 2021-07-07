import java.lang.*;
import java.io.*;

class Demo
{
	public int i,j;
	public void setData(int x,int y)
	{
		i=x;
		j=y;
	}
	public void getData()
	{
		System.out.print(i);
		System.out.println(j);
	}
}

class Hello1
{
	public static void main(String str[])
	{
		Demo obj=new Demo();
		obj.setData(15,16);
		obj.getData();
	}
}

