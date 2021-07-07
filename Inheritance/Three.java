import java.lang.*;
import java.io.*;
import java.util.*;
abstract class Shape
{
	Scanner s=new Scanner(System.in);
	//public double radius;
	public abstract double cal_area();
	public abstract double cal_volume();
}
class Sphere extends Shape
{
	double radius;
	public void Accept()
	{
		System.out.println("Enter the radius");
		radius=s.nextDouble();
	}

	public double cal_area()
	{
		return (4*Math.PI*radius*radius);
	}
	public double cal_volume()
	{
		return (1.3*Math.PI*radius*radius*radius);
	}
}
class Cone extends Shape
{
	public double height,radius;
	public void Accept()
	{
		System.out.println("Enter the radius and height");
		radius=s.nextDouble();
		height=s.nextDouble();
	}

	public double cal_area()
	{
		return (4*Math.PI*radius*height);
	}
	public double cal_volume()
	{
		return (0.3*Math.PI*radius*radius*height);
	}
}
class Cylinder extends Shape
{
	public double height,radius;
	public void Accept()
	{
		System.out.println("Enter the radius and height");
		radius=s.nextDouble();
		height=s.nextDouble();
	}

	public double cal_area()
	{
		return (2*Math.PI*radius*height);
	}
	public double cal_volume()
	{
		return (Math.PI*radius*radius*height);
	}
}
class Box extends Shape
{
	public double height;
	public int length,breadth;
	public void Accept()
	{
		System.out.println("Enter height,length and breadth");
		height=s.nextDouble();
		length=s.nextInt();
		breadth=s.nextInt();
	}	
	public double cal_area()
	{
		return (length*breadth*height);
	}
	public double cal_volume()
	{
		return (2*(length*breadth)+(breadth*height)+(height*length));
	}
}
class Three
{
	public static void main(String arg[])
	{
		double area,volume;
		Sphere s=new Sphere();
		s.Accept();
		area=s.cal_area();
		System.out.println("The area of sphere is "+area);
		volume=s.cal_volume();
		System.out.println("The volume of sphere is "+volume);
		Cone c=new Cone();
		c.Accept();
		area=c.cal_area();
                System.out.println("The area of cone is "+area);
                volume=c.cal_volume();
                System.out.println("The volume of cone is "+volume);
		Cylinder cn=new Cylinder();
		cn.Accept();
		area=cn.cal_area();
                System.out.println("The area of cylinder is "+area);
                volume=cn.cal_volume();
                System.out.println("The volume of cyinder is "+volume);
		Box b=new Box();
		b.Accept();
		 area=b.cal_area();
                System.out.println("The area of box is "+area);
                volume=b.cal_volume();
                System.out.println("The volume of box is "+volume);

		
		
	}
}
