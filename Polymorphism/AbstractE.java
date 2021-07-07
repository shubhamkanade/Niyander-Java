/*Abstratct class =>is a class which contains 0 or more abstract methods in it 
	we cannot create object of that class
  it contains following things 
  1) 0 or more constructors
  2) 0 or more concreate methods
  3) any type of of characteristics
 */
import java.lang.*;
import java.io.*;

abstract class Base
{
	public int no1;

	
	public Base()
	{
		no1=11;
	}
	public void fun()
	{
		System.out.println("Base fun");
	}
	abstract public void gun();
}
class Derived extends Base
{
	public int j;
	public Derived()
	{
		j=21;
	}
	public void gun()
	{
		System.out.println("Derived gun");
	}
	public void run()
	{
		System.out.println("concreate run");
	}
}
class AbstractE
{
	public static void main(String arg[])
	{
		//Base b=new Base();
		Derived d=new Derived();
		Base b=new Derived();
		b.gun();
		//b.run(); Error
		b.fun();
	}
}























