import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class hobby extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException

	{	
		String data=req.getParameter("hobby");

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body>");
		Cookie cookies[]=req.getCookies();

		//tpSession hs=req.getSession(true);
		if(cookies!=null)
		{
			out.println("existing cookies");
			for(int i=0;i<cookies.length;i++)
			{
				String name=cookies[i].getName();
				String value=cookies[i].getValue();
				out.print("cookie name"+name+"<br>");
				out.print("cookie value"+value+"<br>");
			}
		}               
		for(int j=0;j<cookies.length;j++)
		{
			if(cookies[j].getValue().equals(data))
			{
				out.println("cookies exit for"+data);
				return;
			}
		}
		Cookie c1=new Cookie("hobbies",data);
		res.addCookie(c1);
		out.println("cookies added"+data);
	}


}



