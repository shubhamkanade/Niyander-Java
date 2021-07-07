import java.io.*;
import java.util.*;
class Dinput
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("enter the name,age,salary:");

		String str=br.readLine();

		StringTokenizer st=new StringTokenizer(str, ",");

		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();

		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();

		String name=s1;
		int age=Integer.parseInt(s2);
		float sal=Float.parseFloat(s3);

		System.out.printf("name=%d\n",name);
		System.out.printf("age is=%d\n",age);
		System.out.printf("salary is=%f\n",sal);
	}
}
