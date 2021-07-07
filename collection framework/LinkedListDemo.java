import java.util.*;
import java.lang.*;

class LinkedListDemo
{
public static void main(String arg[])
{
LinkedList<String> ll=new LinkedList<String>();
//insert at last position
ll.add("first");
ll.add("2");
ll.add("third");
ll.add("forth");
ll.add("fifth");

//System.out.println("contents from linked list are: "+ll);
for(String str:ll)
System.out.println(str);
System.out.println();
Iterator iobj=ll.iterator();
while(iobj.hasNext())

System.out.println(iobj.next());

}
}

