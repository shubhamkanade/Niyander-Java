import java.lang.*;

class Hello
{
	public int iNo1,iNo2;

	public Hello()
	{
		this(11,21);
		iNo1=0;
		iNo2=0;
		//this(11,21);
	}
	public Hello(int iNo1,int iNo2)
	{
		this.iNo1=iNo2;
		this.iNo2=iNo2;
	}
	public Hello(Hello obj)
	{
		iNo1=obj.iNo1;
		iNo2=obj.iNo2;
	}
	public void finalize()
	{
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Hello hobj1=new Hello();
		Hello hobj2=new Hello();
		Hello hobj3=new Hello(hobj2);
		//Hello hobj4=hobj3.clone();
	}
}

