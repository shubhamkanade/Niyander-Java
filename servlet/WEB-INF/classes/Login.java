import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import java.sql.*;


public class Login extends HttpServlet
{
	Statement st;
	ResultSet rs;
	Connection con;
	boolean flag;
	int cnt;

	public  void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name = request.getParameter("Username");
		String password = request.getParameter("Password");
		
		String sql = "select * from login where name= '"+name+"' and password= '"+password+"';";
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://192.168.100.253/tydb49","ty49","");
			st=con.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next())
			{
				out.print("Welcome");
				Cookie[] cookie=request.getCookies();
				
				flag=false;
				for(int i=0;i<cookie.length;i++)
				{
					if(cookie[i].getName().equals(name))
					{	cnt=Integer.parseInt(cookie[i].getValue()) +1;
						out.print("<br>Number of times successfully visit"+cnt);
						flag=true;
						break;
				}	}
			
				if(!flag)
				{
				cnt=1;
				out.print("<br>Number of time successfully visit"+cnt);
				}
				Cookie c =new Cookie(name,""+cnt);
				response.addCookie(c);

			}else
			{
				out.print("<center><font color='red'> !email");

			}
			
		}catch(Exception error)
		{
			out.print("Error:"+error);			
	 	}
	}
}
