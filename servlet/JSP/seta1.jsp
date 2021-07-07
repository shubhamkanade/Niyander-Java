<%@page language="java" %>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*" %>
<%@page import="javax.servlet.ServletContext"%>

<%
	//out
	Date d=new Date();
	out.println("Current time is:" + d +"<br><br>");

	//request
	String browser=request.getHeader("User-Agent");
	out.println("Request User-Agent : "+ browser +"<br><br>");
	
	//response
	Cookie c=new Cookie("c1","1");
	response.addCookie(c);
	out.println("Cookie is added : "+c.getName()+"<br><br>"+"cookie value is"+c.getValue()+"<br><br>");

	//CONFIG
	String initparam=config.getInitParameter("city");
	out.println("City init parameter value :" + initparam +"<br><br>");

	//application
	String app=application.getInitParameter("state");
	out.println("State context parameter value = "+app+",<br><br>");
	
	//session
	HttpSession hs=request.getSession(true);
	out.println("Session id= "+hs.getId()+"<br><br>");
	
	//page context 
/*	pageContext.setAttribute("Uname","User",PageContext.SESSION_SCOPE);
	
	pageContext.setAttribute("UPassword","SPPU",PageContext.SESSION_SCOPE);
	
	String usern=(String)pageContext.getAttribute("Uname",PageContext.SESSION_SCOPE);
	
	String passwd=(String)pageContext.getAttribute("UPassword",PageContext.SESSION_SCOPE);
	
//	out.println("Page context attribute :{ Name= "+ usern + " value=" +passwd } <br><br>");
	
	//page
	Object page=this;
	out.println("generated servlet name"+page);*/
%>
