//on server side there is no need to write printf statement becoz server side is continously running
//here we are printing to show demo only
import java.io.*;
import java.net.*;

class Server
{
	public static void main(String arg[]) throws Exception
	{
		System.out.println("server is running");

		ServerSocket ssobj=new ServerSocket(2100); //port no to send the client

		Socket sobj=ssobj.accept(); //to accept the request

		OutputStream oobj=sobj.getOutputStream();
		PrintStream pobj=new PrintStream(oobj);

		String str="marvellous InfoSystem";

		pobj.println(str);

		System.out.println("data send successfully");

		pobj.close();

		sobj.close();

		ssobj.close();

	}//end of main
}//end of class



