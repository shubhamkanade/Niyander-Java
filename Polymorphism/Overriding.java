//Method Overriding
/*If derived class contains method which is already available in base class then derived class 
  acheive the concept of method overriding*/

import java.lang.*;
import java.io.*;

class Base
{
	public int i,j;
	public Base()
	{
		i=10;
		j=20;
	}
	public void fun()
	{
		System.out.println("In Base Fun");
	}
	public void gun()
	{
		System.out.println("In Base Gun");
	}
}
class Derived extends Base
{
	public int i,x;
	public Derived()
	{
		i=30;
		x=40;
	}
	public void fun()
	{
		System.out.println("In Derived Fun");
	}
	public void run()
	{
		System.out.println("In Derived run");
	}
}
class Overriding
{
public static void main(String arg[])
{
Base b1=new Base(); //i,j
Derived d1=new Derived(); //i,x
Base b2=new Derived();
System.out.println(b1.i);
System.out.println(b1.j);
b1.fun();
b1.gun();
System.out.println(d1.i);
System.out.println(d1.x);
d1.fun();
d1.gun();
System.out.println(b2.i);
System.out.println(b2.j);
//ystem.out.println(b1.i);
//System.out.println(b2.x); Error
b2.fun();
//b2.run();
b2.gun();
}
}

























