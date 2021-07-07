import java.io.*;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Hello");
	}
}
class ThreadTest
{
	public static void main(String arg[])
	{
		Mythread m=new Mythread();
		m.start();
	}
}

 
