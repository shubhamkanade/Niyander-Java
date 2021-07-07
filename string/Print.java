import java.lang.*;
import java.io.*;
import java.util.*;

class Print
{
	/*public static int Reverse(int no)
	{
		int rev=0,digit=0;
		
		while(no!=0)
		{
			digit=no%10;
			rev=rev*10;
			rev=rev+digit;
			no/=10;
		}
		return rev;
	}*/
	public static void Show(int no)
	{
		no=Reverse(no);
		while(no!=0)
		{
		//int digit=(int)no%10;
		//System.out.printf("%d ",digit);
		switch(no%10)
		{
			case 1:System.out.print("One ");break;
			case 2:System.out.print("Two ");break;
			case 3:System.out.print("Three ");break;	
			case 4:System.out.print("Four ");break;
		}
		//no=no/10
		no=no/10;
		}
	}
	 public static int Reverse(int no)
        {
                int rev=0,digit=0;

                while(no!=0)
                {
                        digit=no%10;
                        rev=rev*10;
                        rev=rev+digit;
                        no/=10;
                }
                return rev;
        }

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		Show(no);		
	}	
}
