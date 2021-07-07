import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class Visit extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException

	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		int count=0;
		Cookie[] c=req.getCookies();
		if(c==null)
		{	count=1;
			out.print("welcome user count="+count);
		}
		else
		{
		
			for(int i=0;i<c.length;i++)
			{	
				if(c[i].getName().equals("count"))
				{
					 count=Integer.parseInt(c[i].getValue())+1;
					out.print("welcome back use <br> count="+count);

			}
		}


		Cookie ck=new Cookie("count",""+count);
		res.addCookie(ck);
}
}
}
