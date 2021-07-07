import java.lang.*;

public class static_program
{
	static int a = 21;
	static int b = func();

	public static void func()
	{
		System.out.println(22);
	}
	public static void main(String arg[])
	{
		System.out.println("Hello from java" + a); 
		System.out.println("Hello from java" + b);
	}
}
