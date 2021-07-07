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
class AbstractDemo
{
	public static void main(String arg[])
	{
		//shape s;
		shape s=new shape(3,4);
		shape s1=new circle(2);
		System.out.print("the area is="+s.area());
	}
}
