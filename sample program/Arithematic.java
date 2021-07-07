import java.lang.*;
import java.io.*;
class demo
{
	public long iNo1,iNo2;
	public long Add()
	{
		return iNo1+iNo2;
	}
	public long sub()
	{
		return iNo1-iNo2;
	}
	public void setData(long x,long y)
	{
		iNo1=x;
		iNo2=y;
	}
	public void getData()
	{
		System.out.println("first parameter"+iNo1+"second parameter"+iNo2);
	}

}
class Arithematic
{
	public static void main(String arg[]) throws IOException
	{
		demo obj1;
		demo obj2;

		obj1=new demo();
		obj2=new demo();

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number");
		long x=Long.parseLong(br.readLine());
		System.out.println("Enter second Number");
		long y=Long.parseLong(br.readLine());

		obj1.setData(x,y);
		obj1.getData();
	//	System.out.println("The addition is "+obj1.Add(x,y));
	//	System.out.println("The subtraction is "+obj1.sub(x,y));
		long iResult=obj1.Add();
		System.out.println("the addition is "+iResult);
		iResult=obj1.sub();
		    System.out.println("the sutraction is "+iResult);




}
}










