import java.lang.*;
import java.io.*;
import java.util.*;

class Sample
{
	public static void main(String arg[])
	{
		int count=3;
		int count1=3;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter Username");
		String usr=s.nextLine();
		System.out.println("ENter password");
		String pass=s.nextLine();
		if(usr.equals("shubham") && pass.equals("kanade"))
		{
			System.out.println("Login Successfully");
			//break;
		}
		if(usr.equals("shubham") && (!pass.equals("kanade")))
		{
			while(count1!=0)
			{
				//System.out.println("Enter correct password");
				//System.out.println("ENter password");
				//pass=s.nextLine();
				if(pass.equals("kanade"))
				{
					System.out.println("Login successfully");
					break;
				}
				else
				{
					System.out.println("Enter correct password");	
				}
				System.out.println("ENter password");
                                pass=s.nextLine();

				count1--;
			}	
		}
		/*else
		  {
		  if(count==1)
		  {
		  System.out.println("Your attepmt was finished");
		  break;
		  }
		  System.out.println("Invalid login Please enter correct username and password");
		  count--;
		  }*/
	}
}

