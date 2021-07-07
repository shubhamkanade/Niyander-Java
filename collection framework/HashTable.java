import java.util.*;
class HashTable
{
public static void main(String arg[])
{      // key  ---- value     
Hashtable<String,Integer> obj=new Hashtable<String,Integer>();

obj.put("Marvellous",10);
obj.put("Quick Heal",20);
obj.put("Avaya",30);
obj.put("Avaya",40);

//System.out.println("With Enumeration");;
/*Enumeration eobj=obj.keys();
while(eobj.hasMoreElements())
System.out.println(eobj.nextElement());*/ //it displays only keys not value

//System.out.println("with object ");;
System.out.println(obj);
}
}

///////////OUTPUT///////////////////////

//{Avaya=40, Quick Heal=20, Marvellous=10}
