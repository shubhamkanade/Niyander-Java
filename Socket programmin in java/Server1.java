import java.net.*;
import java.io.*;

class Server1
{
        public static void main(String arg[]) throws Exception
        {
                ServerSocket ss=new ServerSocket(3000);
		
		Socket s=ss.accept();
		
                System.out.println("server running");

                BufferedReader kbr=new BufferedReader(new InputStreamReader(System.in)); //for keybord
                PrintStream ps=new PrintStream(s.getOutputStream());
		
                BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                String str1,str2;
                while((str1=br.readLine())!=null)
                {
                       System.out.println(str1);
			str2=kbr.readLine();
			ps.println(str2);
                }
                ps.close();
		br.close();
		kbr.close();
		s.close();
		ss.close();



        }//end of main
}//end of server1

