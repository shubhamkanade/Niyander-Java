import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Shopping extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String values[]=req.getParameterValues("item");

		int sum=0;
		if(values!=null)
		{
			for(int i=0;i<values.length;i++)
				sum=sum+Integer.parseInt(values[i]);
		}

		out.println("<html>");
		out.println("<head>");
		out.println("Your Bill is = "+sum);
		out.println("\n\n Thanks for Shooping ");
		out.println("</html></head>");
	}
}

