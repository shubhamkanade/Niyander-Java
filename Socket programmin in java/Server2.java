import java.io.*;
import java.net.*;

class Server2
{
	public static void main(String arg[]) throws Exception
	{
		System.out.println("server is running");
		ServerSocket ssobj=new ServerSocket(2200);
		Socket sobj=ssobj.accept();
		System.out.println("connection established" );

		BufferedReader br,brk;
		brk=new BufferedReader(new InputStreamReader(System.in));

		br=new BufferedReader(new InputStreamReader(sobj.getInputStream()));

		PrintStream pobj=new PrintStream(sobj.getOutputStream());

		String str1,str2;
		while(true)
		{
			str1=br.readLine();
			System.out.println("massage from client"+str1);
			System.out.println("massage for client");
			str2=brk.readLine();
			if(str2.equals("exit"))
			break;
			pobj.print(str2);
		}
		pobj.close();
		sobj.close();
		br.close();
		ssobj.close();
	}
}
