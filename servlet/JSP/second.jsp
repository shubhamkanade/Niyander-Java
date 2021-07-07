<%@page language="java"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page session="true"%>

<%!static int a=1;%>
<%!static public int count=1;%>
<%
Connection conn=null;
Statement st=null;
ResultSet rs=null;
String ans=request.getParameter("option");
HttpSession hs=request.getSession(true);
try
{
	Class.forName("org.postgresql.Driver");
	conn=DriverManager.getConnection("jdbc:postgresql://192.168.100.253/tydb29","ty29","");
	if(conn==null)
{	
	out.println("Connection Failed");
}
else
{
	if(a<=5)
	{
		out.println("Connection Successful");
		st=conn.createStatement();
		rs=st.executeQuery("select correct from QandA where id="+a);
		a++;
		rs.next();
		out.println("Result:"+rs.getString(1)+"<br><br>");
		out.println("Option:"+ans+"<br><br>");
		String correct=rs.getString(1);
		if(ans.equals(correct))
		{
			hs.setAttribute("test",count);
			count++;
			out.println("<br>Session score:"+hs.getValue("test"));
		}
		response.sendRedirect("first.jsp");
	}
	else
	{
		a=1;
	}
}
}
catch(Exception e)
{
out.println("Exception:"+e);
}
%>

