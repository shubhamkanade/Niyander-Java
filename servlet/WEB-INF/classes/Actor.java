import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import java.sql.*;

public class Actor extends HttpServlet
{
	Statement st;
	ResultSet rs;
	Connection con;		
	public void doGet( HttpServletRequest request , HttpServletResponse response ) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String choice = request.getParameter("choice");
		String actorName = request.getParameter("actorName");
		String movieName = request.getParameter("movieName");
		String sql;
		try{
		
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://192.168.100.253/tydb49","ty49","");
			st=con.createStatement();
			if( choice.equals("actor"))
			{
				sql = "select * from actor where actor_no in ( select actor_no from movie_actor where movie_no in ( select movie_no from movie where movie_name = '"+movieName+"' ) );";
        			rs=st.executeQuery(sql);
				if(rs.next())
				{
					out.print("<b>Actor in movie "+movieName+"</b>");
					do
					{
						out.print("<br>Actor Name: "+rs.getString("name"));
					}while(rs.next());
				}
			}
			if( choice.equals("movie"))
			{
				sql = "select * from movie where movie_no in ( select movie_no from movie_actor where actor_no in ( select actor_no from actor where name = '"+actorName+"' ) );";
        			rs=st.executeQuery(sql);
				if(rs.next())
				{
					out.print("<b>"+movieName+" act in Movie </b>");
					do
					{
						out.print("<br>Movie Name: "+rs.getString("movie_name"));
					}while(rs.next());
				}
			}
			
		}catch(Exception error)
		{
			out.print("Error: "+error);		
		}				
	}	
}
