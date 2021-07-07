import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class Shopping extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException

	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		HttpSession hs=req.getSession(true);

		String[] values=req.getParameterValues("item");
		int count =0;
		for(String s:values)
		{		
			count+=Integer.parseInt(s);
		}
		hs.setAttribute("totalpage1",""+count); //conver to string
		res.sendRedirect("shoppping1.html");
	}
}
