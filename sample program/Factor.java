import java.io.*;;
import java.lang.*;

class Hello
{
	public long  factorial(int iNum)
	{
		int iFact=1;
		if(iNum==0)
			return -1;;;
				
		for(;iNum!=0;iNum--)
		{
			iFact=iFact*iNum;
		}
		return iFact;
	}
}
class Factor
{
	public static void main(String arg[])throws Exception
	{
		Hello hobj=new Hello();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int iValue=Integer.parseInt(br.readLine());
		long ret=hobj.factorial(iValue);
		System.out.println(ret);
	}
}
