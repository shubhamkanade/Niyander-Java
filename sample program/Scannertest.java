import java.io.*;
import java.util.*;
class Scannertest
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no and name");
		int rollno=sc.nextInt();
		String str=sc.next();
		System.out.println("\nroll no="+rollno+ "\nstring is="+str);
		sc.close();
	}
}
