import java.io.*;
import java.net.*;
import java.util.*;

class URL_Format
{
	public static void main(String a[])throws Exception
	{
		URL obj=new URL("http://facebook.com/login.html");

		System.out.println(obj.getProtocol());
		System.out.println(obj.getHost());
		System.out.println(obj.getFile());
		System.out.println(obj.getPort());
		System.out.println(obj.getPath());
	}
}



