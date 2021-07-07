<%@page language="java"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%!static int a=1;%>
<%
try
{
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	Class.forName("org.postgresql.Driver");
	conn=DriverManager.getConnection("jdbc:postgresql://192.168.100.253/tydb29","ty29","");
	if(conn==null)
		out.println("Connection Failed");

	else
	{
		if(a<=5)
		{
			//Random r=new Random();
			//int a=r.nextInt(4)+1;
			out.println("Connection Successful<br>");
			st=conn.createStatement();
			rs=st.executeQuery("select * from QandA where id="+a);
			a++;
			rs.next();
			%>
				<form action="second.jsp" method="post">
				Question:<%
				out.println(rs.getString(2));%><br><br>
				<input type="radio" name="option" value="<%out.print(rs.getString(3));%>">
				<%out.println(rs.getString(3));%>
				<br>
				<input type="radio" name="option" value="<%out.print(rs.getString(4));%>">
				<%out.println(rs.getString(4));%>
				<br>
				<input type="radio" name="option" value="<%out.print(rs.getString(5));%>">
				<%out.println(rs.getString(5));%>
				<br>
				<input type="radio" name="option" value="<%out.print(rs.getString(6));%>">
				<%out.println(rs.getString(6));%>
				<br>
				<input type="submit" name="next"  value="next">
				<input type="button" name="submit" value="submit" onclick="location.href='third.jsp';">
				</form>
				<%
		}
		else{
			out.println("<br>br>All question are over!!!");
			a=1;
			%>
				<form action="third.jsp" method="post">
				<input type="submit" name="submit" value="submit">
				</form>
				<%
		}
	}
}
catch(Exception e)
{
	out.println("Exception"+e);
}
%>


