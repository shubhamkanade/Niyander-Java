//import java.lang.*;
import java.io.*;
import java.net.*;
class Client 
{
	public static void main(String abc[]) throws Exception
	{
		System.out.println("client is running");

		Socket s=new Socket("localhost",2100);

		System.out.println("connection established");

		InputStream iobj=s.getInputStream();

		BufferedReader br;
		br=new BufferedReader(new InputStreamReader(iobj));

		String str=br.readLine();
		System.out.println(str);

		br.close();
		s.close();
	}
}



