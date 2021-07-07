<%@page language="java"%>
<%@page import="java.util.*"%>
<%@page session="true"%>
<%
out.println("In submit score is:"+session.getValue("test"));
%>

