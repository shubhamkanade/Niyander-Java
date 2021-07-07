/* Generic class i s a class which contain atleast single generic characteristics and all methods of that class bydefault considered as a generic */

import java.lang.*;
import java.io.*;

class Arithematic <T>
{
	public T no1;
	public T no2;

	public Arithematic(T value1,T value2)
	{
		no1=value1;
		no2=value2
		;
	}
	public T Add()
	{
		return no1;
	}
}
class Generic_Class
{		
	public static void main(String arg[])
	{	
		Arithematic<Integer> obj1=new Arithematic<>(10,20);;;
		Arithematic<Float> obj2=new Arithematic<>(30.0f,40.0f);
		
		int no=obj1.Add();
		System.out.println(no);
		
		float f=obj2.Add();
		System.out.println(f);
	}	
}		
