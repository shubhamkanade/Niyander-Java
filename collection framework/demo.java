import java.lang.*;
import java.io.*;
import java.util.*;
//linkedlist uses internally concept of doubly linked list
class demo
{
	public static void main(String arg[])
	{
		LinkedList obj=new LinkedList();

		//insert at last position
		obj.add("india");
		obj.add("america");
		obj.add("japan");

		obj.addFirst("demo");
		obj.add(3,"abc");
obj.add(3,"xyz");
	//	System.out.println(obj.size());
	//	obj.removeFirst();
	//	obj.clear();
		
		//printing there are 3 options
		//System.out.println(obj);//by priting its object 
		//
		/*for(String s:obj) //by using for each loop
		  {
		  System.out.println(s);

		  }*/
		Iterator i=obj.iterator(); //by using itertaor
		while(i.hasNext())
		{
			System.out.println(i.next());
		}




	}
}
