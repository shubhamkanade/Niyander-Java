import java.net.*;
import java.io.*;

class Client1
{
	public static void main(String arg[]) throws Exception
	{
		Socket s=new Socket("localhost",3000);

		System.out.println("client running");

		BufferedReader kbr=new BufferedReader(new InputStreamReader(System.in)); //for keybord
		DataOutputStream d=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str1,str2;
		while((str1=kbr.readLine()).equals("exit"))
		{
			d.writeBytes(str1);
			str2=br.readLine();
			System.out.println(str2);
		}
		d.close();
		br.close();
		kbr.close();
		s.close(); 



	}
}
