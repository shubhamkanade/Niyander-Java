import java.lang.*;
import java.io.*;
class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
	class Hello3
	{
		public static void main(String arg[])
		{
			Demo obj=new Demo();
			Demo dobj=new Demo();

			Thread t1=new Thread(obj);
			Thread t2=new Thread(dobj);

			t1.start();
			t2.start();

		}
}
