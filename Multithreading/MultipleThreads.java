import java.io.*;

class Demo extends Thread
{
	public String message;
	public Demo(String message)
	{
		this.message=message;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println(message+" "+i);
	}
}
class MultipleThreads
{
	public static void main(String arg[])
	{
		Demo d1=new Demo("hello");
		Demo d2=new Demo("bye");
		d1.start();
		d2.start();
	}
}
