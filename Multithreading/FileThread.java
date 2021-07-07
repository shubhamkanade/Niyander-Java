import java.io.*;

class FileTest extends Thread
{

	String name;
	public FileTest(String name)
	{
		this.name=name;
	}

	public void run()
	{
		File f=new File(name);
		if(f.exists())
			System.out.println(name+"  "+"File exist");
		else
			System.out.println(name +"   "+"File does not exist");
	}


}
class FileThread 
{
	public static void main(String arg[])
	{
		FileTest ft[]=new FileTest[arg.length];

		for(int i=0;i<arg.length;i++)
		{
			ft[i]=new FileTest(arg[i]);
			ft[i].start();

		}
	}
}
