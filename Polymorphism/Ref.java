	import java.io.*;

class One
{
	void calculate(int x)
	{
		System.out.println("square value = "+(x*x));
	}
}
class Two extends One
{
	void calculate(int x)
	{
		System.out.println("cube value = "+(x*x*x));
	}
}
class Ref
{
	public static void main(String arg[])
	{
		One obj1=new One();
		Two obj2=new Two();
		One o = new Two();
		One ref;
		ref=obj1;
		ref.calculate(2);
		ref=obj2;
		ref.calculate(2);
		o.calculate(2);
	}
}



