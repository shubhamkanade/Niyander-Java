import MarvellousCollection.LinkedList;

class Demo
{
	public static void main(String arg[])
	{
		LinkedList obj=new LinkedList();
		obj.InsertFirst(11);
		obj.InsertFirst(21);
		obj.InsertFirst(51);
		obj.InsertFirst(101);
		obj.InsertFirst(111);

		obj.Display();

		obj.DeleteFirst();
		System.out.println("Ater delete");
		obj.Display();	


	}
}
