import java.lang.*;
import java.util.*;
class prog1
{
	public static void main(String arg[])
	{
		if(arg.length!=2)
			return ;
		String s1=arg[0];
		String s2=arg[1];

		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);

		double d=d1+d2;
		System.out.println("the addition is "+d);
	}
}
