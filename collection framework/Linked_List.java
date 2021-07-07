import java.lang.*;
import java.util.*;
//import java.util.*;
class Linked_List
{
	public static void main(String arg[])
	{
		LinkedList lobj=new LinkedList();

		//Insert at last position

		lobj.add("First");
		lobj.add("Second");
		lobj.add("Third");
		
		lobj.addFirst("demo");
		lobj.addFirst("Hello");		
		//System.out.println(lobj);
	
		//iTerate the linkedlist	
		Iterator iobj=lobj.iterator();
		while(iobj.hasNext())
			{
			System.out.println(iobj.next());
			}
		lobj.removeLast();
		 System.out.println(lobj);
		lobj.remove(1);
		 System.out.println(lobj);
	}
}
