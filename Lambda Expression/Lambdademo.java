import java.io.*;

class Lambdademo
{
	interface Myinter
	{
		void message();
	}
	public static void main(String arg[])
	{
		Myinter mi=()->System.out.println("hello how are you");
		mi.message();
	}
}
