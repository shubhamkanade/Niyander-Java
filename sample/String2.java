import java.io.*;

class String2
{
	public static void main(String arg[])
	{
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1.hashCode());

		s1 = s1 + s2;
		System.out.println(s1.hashCode());
		System.out.println(s1);
	}
}
