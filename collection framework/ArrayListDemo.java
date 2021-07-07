import java.util.*;
class ArrayListDemo
{
public static void main(String arg[])
{
ArrayList a1=new ArrayList();
System.out.println("intial size of al: "+ a1.size());
//add elemets to the array
a1.add("a");
a1.add("a");
a1.add("b");
a1.add("c");
a1.add("d");
a1.add(1,"a2");
System.out.println("size of after additon: "+ a1.size());
//Display the arraylist
System.out.println("contents of a1: "+ a1);
//remove elemets from array
a1.remove("b");
a1.remove(2);
//System.out.println("contents of a1: "+ a1);
System.out.println("size of the array after deletion: "+a1.size());
System.out.println("contents of a1: "+ a1);



}
}
