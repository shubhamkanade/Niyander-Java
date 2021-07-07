import java.lang.*;
interface demo1
{
	int i=11;
	void fun();
	void gun();
	static void run()
	{
		System.out.println("inside default");
	}
	static void run(int i)
	{
		System.out.println("inside default");
	}

}
class demo
{
	public static void main(String arg[])
	{
		demo1.run();
	}
}
