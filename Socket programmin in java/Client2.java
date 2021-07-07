import java.io.*;
import java.net.*;

class Client2
{
	public static void main(String arg[] )throws Exception
	{
		System.out.println("client is running");
		Socket sobj=new Socket("localhost",2200);

		System.out.println("connection established" );

		BufferedReader br,brk;
		brk=new BufferedReader(new InputStreamReader(System.in));

		br=new BufferedReader(new InputStreamReader(sobj.getInputStream()));

		DataOutputStream dobj=new DataOutputStream(sobj.getOutputStream());

		String str1,str2;
		while(true)
		{
			System.out.println("massage for the server");
			str1=brk.readLine();
			if(str1.equals("exit"))
			break;
			dobj.writeBytes(str1);
			str2=br.readLine();
			System.out.println("meassage from server "+str2);
		}
		dobj.close();
		br.close();
		sobj.close();
	}
}








