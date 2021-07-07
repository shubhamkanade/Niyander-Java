import java.lang.*;
import java.io.*;
abstract class shape
{
	double dim1,dim2;
	shape(double d1,double d2)
	{
		dim1=d1;
		dim2=d2;
	}
abstract double area();
}
class circle extends shape
{
	circle(double radius)
	{
		super(radius,0);
	}
	double area()
	{
		return Math.PI*dim1*dim1;
	}
}
class rectangle extends shape
{
	rectangle(double length,double breadth)
	{
		super(length,breadth);
	}
	double area()
	{
		return dim1*dim2;
	}
}
class abstract2 
{
	public static void main(String arg[])
	{
		shape s;
		s=new circle(2);
		System.out.println("area of circle="+s.area());
		s=new rectangle(10,20);
		System.out.println("area of rectangle="+s.area());
	}
}
































