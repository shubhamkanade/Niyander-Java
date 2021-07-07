import java.util.*;
import java.lang.*;
abstract class Staff
{
	Scanner s=new Scanner(System.in);
	public String name,add;
	abstract void Accept();
	abstract void Display();
}
class FullTimeStaff extends Staff
{
	public String department;
	public double salary;
	public FullTimeStaff()
	{
	}
	public FullTimeStaff(String name,String add,String department,double salary)
	{
		super.name=name;
		super.add=add;
		this.department=department;
		this.salary=salary;
	}
	public void Accept()
	{
		System.out.println("Enter name,address,department and salary");
		super.name=s.next();
		super.add=s.next();
		department=s.next();
		salary=s.nextDouble();
	}
	public void Display()
	{
		System.out.println("NAME IS =>"+name+"\nADDRESS IS =>"+add+"\nDEPARTMENT IS =>"+department+"\nSALARY IS =>"+salary); }
}
class PartTimeStaff extends Staff
{
	public int noh,rph;
	public PartTimeStaff()
	{
	}
	public PartTimeStaff(String name,String add,int noh,int rph)
	{
		super.name=name;
		super.add=add;
		this.noh=noh;
		rph=rph;
	}
	public void Accept()
	{
		System.out.println("Enter name,address,no-of-hours and rate-per-hour");
		super.name=s.next();
		super.add=s.next();
		noh=s.nextInt();
		rph=s.nextInt();
	} 
	public void Display()
	{
		System.out.println("NAME IS =>"+name+"\nADDRESS IS =>"+add+"\nNUMBER OF HOUR =>"+noh+"\nRATE PER HOUR =>"+rph); }
}
class Staff1
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many objects");
		int n=s.nextInt();
		System.out.println("Enter your choice for staff 1:FOR FULLTIME 2:FOR PARTTIME");
		int ch=s.nextInt();
		if(ch==1)
		{
			FullTimeStaff f1=new FullTimeStaff("shubham","rahatni","computer-science",40000);
			f1.Display();
			FullTimeStaff f[]=new FullTimeStaff[n];
			for(int i=0;i<n;i++)
				f[i]=new FullTimeStaff();

			for(int i=0;i<n;i++)
			{
				f[i].Accept();
				f[i].Display();
			}
		}
		else
		{
			PartTimeStaff p1=new PartTimeStaff("saurabh","rahatni",10,4);
			p1.Display();
			FullTimeStaff p[]=new FullTimeStaff[n];
			for(int i=0;i<n;i++)
				p[i]=new FullTimeStaff();

			for(int i=0;i<n;i++)
			{
				p[i].Accept();
				p[i].Display();
			}
		}
	}
}
 
