import java.lang.*;
import java.util.*;
class Demo2
{
	public static void main(String arg[])
	{
		int a=0,b=1,c=0,n=0;
		System.out.println("Enter n fibonacci series");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("The fibonacci series is");
		while(n!=0)
		{
			a=b;
			b=c;
			System.out.print(c+" ");
			c=a+b;
			n--;
		}
	}
}


