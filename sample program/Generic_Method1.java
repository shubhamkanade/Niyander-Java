import java.lang.*;
import java.lang.*;

class Generic_Method1<T>
{
	public T no1;
	public T no2;

	public Generic_Method1(T x,T y)
	{
		no1=x;
		no2=y;
	}
	public T add()
	{
		return no1+no2;
	}
	public static void main(String str[])
	{
		Generic_Method1<Integer> obj=new Generic_Method1<Integer>(10,20);
			Generic_Method1<Double> fobj=new Generic_Method1<Double>(3.4,5.4);

			Integer iret=obj.add();
		Float fret=fobj.add();

	}
}
