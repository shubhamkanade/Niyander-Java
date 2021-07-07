import java.lang.*;
import java.io.*;
class Demo 
{
	public static void main(String arg[]) throws Exception  //entry point function
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int iValue1,iValue2;
		System.out.println("enter 2 numbers");
		iValue1=Integer.parseInt(br.readLine());
		iValue2=Integer.parseInt(br.readLine());

		Arithematic obj=new Arithematic(iValue1,iValue2);
		int iRet=0;
		iRet=obj.add();
		System.out.println("the additon is "+iRet);

		iRet=obj.sub();
		System.out.println("the subtraction is "+iRet);

	}
}
class Arithematic 
{
	public int iNo1,iNo2;

	public Arithematic() //default constructor
	{
		iNo1=iNo2=0;
	}
	public Arithematic(int A,int B) //parameterized consrtuctor
	{
		iNo1 = A;
		iNo2 = B;
	}
	public int add()
	{
		return (iNo1+iNo2);
	}
	public int sub()
	{
		return (iNo1-iNo2);
	}
}





























