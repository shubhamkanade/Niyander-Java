import java.lang.*;
import java.io.*;
import java.util.*;

class Display_Time
{
	static void Display(char chDiv)
	{
		if((chDiv=='a')||(chDiv=='A'))
			System.out.printf("9 am");
		else if((chDiv=='b')||(chDiv=='B'))
			System.out.printf("10 am");
		else if((chDiv=='c')||(chDiv=='C'))
			System.out.printf("11 am");
		else if((chDiv=='d')||(chDiv=='D'))
			System.out.printf("2 pm");
		else
			System.out.printf("wrong div");
	}

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter division");
		char ch=s.nextLine().charAt(0);

		Display_Time.Display(ch);
	}
}

