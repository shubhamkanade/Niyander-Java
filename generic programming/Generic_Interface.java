/* Generic interface =>generic interface is same like a generic class but it is interface al methods should be abstract*/
import java.lang.*;
import java.io.*;

interface calculator<T>
{
	T add(T no1,T no2);
}
class Arithematic<T>implements calculator<T>
{
	T add(T no1,T no2)
	{
		T ans;
		ans=no1+no2;
		return ans;
	}
}
class Generic_Interface
{
	public static void main(String arg[])
	{
		Arithematic<Integer> a1=new Arithematic<Integer>();
		Arithematic<Double> a2=new Arithematic<Double>();
		int no=a1.add(10,20);
		System.out.println(no);
	}
}


