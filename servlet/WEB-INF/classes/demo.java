import java.lang.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class demo extends HttpServlet 
{

public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
response.setContentType("text/html");

PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body>");
out.println("hello servlet");
out.println("</body>");
out.println("</html>");

}

}

