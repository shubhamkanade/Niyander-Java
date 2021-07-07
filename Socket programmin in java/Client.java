//for this program we have to open server program and then client program beco when client sends request client should be there

import java.io.*;
import java.net.*;

class Client
{
	public static void main(String arg[])throws Exception
	{

		System.out.println("client is running");

		Socket sobj=new Socket("localhost",2100);   //1st pramter is ip address and 2nd is port no which is given by server

		InputStream iobj=sobj.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(iobj));

		String str;
		str=br.readLine();

		System.out.println("data required from srver "+str);

		br.close();
		sobj.close();
	}//end of main 
}//end of class
