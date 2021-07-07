import java.lang.*;
import java.io.*;
class Base
{
        static void fun()
        {
                System.out.println("In Base Fun");
        }
}
class Derived extends Base
{
        void fun()
        {
        System.out.println("Derived fun");
        //super.fun();
	}
	//super.fun();
}

class Overriding_Static
{
	public static void main(String arg[])
	{
		Base b = new Derived();

		b.fun();	
	}
}
