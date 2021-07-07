import java.lang.*;
//import java.util.*;
interface demo<T>
{
	T add(T no1,T no2);
}
class hello<T> implements demo<T>
{
	public T add(T no1,T no2)
	{
		
	//	ans=no1+no2;
		return no1;
	}
}
class GInterface
{
	public static void main(String args[])
	{
		hello<Integer> hobj=new hello<Integer>();

		hello<Float> fobj=new hello<Float>();

	//	System.out.println("the addition is:"+hobj.add(10,20));
	//	System.out.println("the additon is:"+fobj.add(10.0,20.0));
		int no=hobj.add(10,20);
		System.out.println(no);
	}
}

 
