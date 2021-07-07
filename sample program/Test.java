import java.lang.*;
class Test
{
	public static void main(String arg[])
	{
		String s1="data";
		String s2="base";
		
		System.out.println(s1.hashCode());
		System.out.println("s2 " + s2.hashCode());
		s1=s1+s2;
		System.out.println("s2 " + s2.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(s1);
	}
}
