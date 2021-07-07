import java.lang.*;
class ExceptionDemo
{
	public static void main(String arg[])
	{
		int a,b,c;
		try
		{
			System.out.println("In try Block");
			a=Integer.parseInt(arg[0]);
			b=Integer.parseInt(arg[1]);
			c=a/b;
			System.out.println("Quatient = "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught "+ae);
		}
		finally
		{
			System.out.println("In finally always execute");
		}
		System.out.println("After Finally Block");
	}
}
//java ExceptionDemo a 10
/////////////////////////////////////////output////////////////////////////////////////////////////////////////////////In try Block
//In finally always execute
//Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
//	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//	at java.lang.Integer.parseInt(Integer.java:580)
//	at java.lang.Integer.parseInt(Integer.java:615)
//	at ExceptionDemo.main(ExceptionDemo.java:10)
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

