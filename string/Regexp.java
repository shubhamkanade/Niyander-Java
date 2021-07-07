import java.lang.*;
import java.util.*;

//input----> abc@india*demo$pqr
//output---> abcindiademopqr@*$

class Demo
{
	public String Special(String str)
	{
		String arr="[a-zA-z0-9]";
		String first="";
		String second="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(String.valueOf(ch).matches(arr))
				first=first+ch;
			else
				second=second+ch;
		}
		return first+second;

	}
}
class Regexp
{
  public static void main(String arg[])
        {
                Scanner s=new Scanner(System.in);
                Demo d=new Demo();
                System.out.println("ENter string");
                String input=s.nextLine();
                String ret=d.Special(input);
                System.out.println("The regular expression is "+ret);
        }

}
