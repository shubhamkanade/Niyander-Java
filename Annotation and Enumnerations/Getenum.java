import java.util.*;
enum Icecream{
	Vanilla(20),chocolate(22.50),strawberry(23.00),Rasberry(25.00);

	private double price;

	Icecream(double p)
	{
		price=p;
	}

	static void getPrice(int i)
	{
		Icecream all[]=Icecream.values();
		System.out.println("Price of your ice-cream is  "+all[i].price);
	}
}//end of enumeration
class Getenum
{
	public static void main(String arg[])
	{
		System.out.println("Available Icecreams are");
		for(Icecream i:Icecream.values())
		{
			int n=i.ordinal();
		System.out.println(n+" "+i);
			}
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice");
		int n1=s.nextInt();
		Icecream.getPrice(n1);
	}
}

 

