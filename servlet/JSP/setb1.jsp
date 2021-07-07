<%@page language="java" %>
<%@page import="java.servlet.*"%>
<%@page import="java.servlet.http.*"%>
<%@page import="java.util.*"%>
<%@page %>
<%@page %>

<%
	String name=request.getParameter("me");
	Date d=new Date();
	
	if(d.getHours()<12)
	{
		out.println("<h3> GOOD MORNING "+name+"</h3>");
		
	}
	
	else if(d.getHours()>=12 && d.getHours()<=17)
        {
              out.println("<h3>GOOD AFTERNOON "+name+"</h3>");

        }
    	else if(d.getHours()>17)
        {
                out.println("<h3> GOOD EVENING "+name+"</h3>");

        }
    	else
        {
                out.println("<h3>NOT SURE WHAT TIME IT IS "+name+"</h3>");

        }

	
%>
