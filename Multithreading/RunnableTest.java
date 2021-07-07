import java.io.*;
class Demo implements Runnable
{
	public void run()
	{

		for(int i=0;i<5;i++)
			System.out.print("Hello"+"\t");
	}
}
class RunnableTest
{
	public static void main(String arg[])
	{
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
	}
}

