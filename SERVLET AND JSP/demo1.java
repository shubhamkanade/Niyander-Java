import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class demo1 extends HttpServlet
{
        public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
        {
                response.setContentType("text/html");
                PrintWriter out=response.getWriter();
                out.println("<html>");
                out.println("<body>");
                out.println("This is my first servlet program");
                out.println("</body>");
                out.println("</html>");
        }
}

