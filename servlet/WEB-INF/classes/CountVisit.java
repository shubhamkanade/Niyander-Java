import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class CountVisit extends HttpServlet
{
	public void doGet( HttpServletRequest request , HttpServletResponse response ) throws ServletException , IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookie = request.getCookies();
		int flag = 0;
		int cnt ;		
		
		if(cookie == null)
		{
			cnt = 1;
			out.print("Welcome user <br>count = "+cnt);
			Cookie c = new Cookie("count",""+cnt);
			response.addCookie(c);		
		}
		else
		{
		
			for( int i = 0 ; i < cookie.length ; i++ )
			{
				if( cookie[i].getName().equals("count") )
				{
				
					cnt = Integer.parseInt(cookie[i].getValue());
					out.print("Welcome back <br> count =   "+cnt);
					cnt++;
					Cookie c = new Cookie("count",""+cnt);
					response.addCookie(c);	
				}
			}	
		}

	}
}
