import java.lang.*;
import java.util.*;
class Vehicle
{
	Scanner s=new Scanner(System.in);
	public String company;
	public int price;
	public void Accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\"Enter company name and it's price\"");
		company=s.next();
		price=s.nextInt();
	}
	public void Display()
	{
		System.out.println("The company name is "+company+"\nit's price is "+price);
	}
}
class LightMotorVehicle extends Vehicle
{
	public int milage;
	public void Accept()
	{
		System.out.println("Enter the milage");
		milage=s.nextInt();
		super.Accept();
	}
	public void Display()
	{
		System.out.println("The milage is "+milage);
		super.Display();
	}
}
class HeavyMotorVehicle extends Vehicle
{
	public int cot;
	public void Accept()
	{
		System.out.println("Enter capacity in tons");
		cot=s.nextInt();
		super.Accept();
	}
	public void Display()
	{
		System.out.println("The capacity in tons is "+cot);
		super.Display();
	}
}
class Vehicle1
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many vehicle you want");
		int n=s.nextInt();
		System.out.println("Enter type of vehicle 1:for Heavymotor 2:for lightmotor");
		char ch=s.next().charAt(0);
		if(ch==1)
		{
			HeavyMotorVehicle h[]=new HeavyMotorVehicle[n];
			for(int i=0;i<n;i++)
				h[i]=new HeavyMotorVehicle();

			for(int i=0;i<n;i++)
			{
				h[i].Accept();
				h[i].Display();
			}
		}
		else
		{
			LightMotorVehicle l[]=new LightMotorVehicle[n];
			for(int i=0;i<n;i++)
				l[i]=new LightMotorVehicle();

			for(int i=0;i<n;i++)
			{
				l[i].Accept();
				l[i].Display();
			}
		}
	}
}








