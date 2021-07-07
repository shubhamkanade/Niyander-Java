import java.io.*;
class base
{
	public int k = 10;	
}
class derived extends base
{
	public int i = 11;		
	void gun()
	{
		System.out.println(super.k);	
	}

}
class derived2 extends derived
{
	void mun()
	{
		System.out.println(super.i);
		super.gun();
		System.out.println("In mun method of derived2 class");
	}
}
class ml
{
	public static void main(String arg[])
	{
		derived2 dobj = new derived2();
		dobj.mun();
	}

}


