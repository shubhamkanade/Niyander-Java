import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class Information extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException

	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Properties p=System.getProperties();
		out.print("Ip address:"+req.getRemoteAddr()+"<br>");
		out.print("server name:"+req.getRemoteAddr()+"<br>");
		out.print("SErver port:"+req.getRemoteAddr()+"<br>");
		out.print("os name:"+p.getProperty("os name")+"<br>");


		out.print("servlet name:"+this.getServletName()+"<br>");
	}
}

