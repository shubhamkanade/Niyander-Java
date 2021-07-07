import MarvellousCollection.LinkedList;
import MarvellousCollection.Node;

class Demo
{
	public static void main(String arg[])
	{
		LinkedList obj=new LinkedList();

		obj.InsertFirst("ABC","Pune",07);
		obj.InsertFirst("PQR","Mumbai",07);
		obj.InsertFirst("XYZ","Nashik",07);
		obj.InsertFirst("LMN","Nagar",07);

		obj.DisplayAll();

		System.out.println("Information of PQR");
		obj.DisplaySpecificName("PQR");
		obj.DisplaySpecificAddress("Pune");

		System.out.println("Summesion  is : "+obj.Sum());
		System.out.println("Maximum is : "+obj.Min());
		System.out.println("Minimum is : "+obj.Max());
		System.out.println("Avarage is : "+obj.Avg());


	}
}

