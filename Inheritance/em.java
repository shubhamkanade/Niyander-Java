import java.lang.*;
import java.io.*;
import java.util.*;

class Employee
{
	private int id;
	private double salary;
	private String name,dm;
	public Employee()
	{
		id=0;
		salary=50.00;
		name=null;
		dm=null;
	}
	public Employee(int id,String name,String dm,double salary)
	{
		this.id=id;
		this.name=name;
		this.dm=dm;
		this.salary=salary;
	}
	public void Accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id ,name,department,salary");
		id=s.nextInt();
		name=s.next();
		dm=s.next();
		salary=s.nextDouble();
	}
	public void Display()
	{
		System.out.println("The id is-"+id+"\n"+"The name is-"+name+"\n"+"The department name is-"+dm+"\n"+"The salary is-"+salary);
	}
	public double getSalary()
	{
		return salary;
	}
}
class Manager extends Employee
{
	private double bonus;	
	public double total;
	public Manager()
	{
	}
	public Manager(int id,String name,String dm,double salary,double bonus)
	{
		super(id,name,dm,salary);
		this.bonus=bonus;
	}
	public void Accept()
	{
		super.Accept();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the bonus");
		bonus=s.nextDouble();
	}
	public void Display()
	{
		super.Display();
		       System.out.println("The bonus is "+bonus);
	}
	public void caltotal()
	{
	total=super.getSalary()+bonus;
	System.out.println("The total is "+total);
	}
}
class em
{
	public static void main(String arg[])
	{
		Manager m=new Manager(1,"vaibhav","history",500000,3000);
		m.Display();
		m.caltotal();
		double max=0.0;
		int j=0;
		System.out.println("Enter how many objects");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Manager m1[]=new Manager[n];
		for(int i=0;i<n;i++)
		{
			m1[i]=new Manager();
			m1[i].Accept();
		}
		for(int i=0;i<n;i++)
			{
			m1[i].Display();
			m1[i].caltotal();
		}
		System.out.println("HIGHEST SALARY MANAGER");
		for(int i=0;i<n;i++)
		{
			if(m1[i].total>max)
			{
			max=m1[i].total;
			j=i;
		}
		}
		m1[j].Display();
		


	
	}
}
