import java.lang.*;
import java.io.*;

class Demo1
{
	public static void main(String arg[])
	{
		boolean x=true;
b11:
		{
b12:
			{
b13:
				{
					System.out.println("Block3");
				if(x)	break b12;
				} //end of b13
				System.out.println("Block2");
			}
			System.out.println("Block1");
		}
	}
}

