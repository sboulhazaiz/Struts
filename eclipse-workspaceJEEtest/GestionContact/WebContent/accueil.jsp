<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String nom = request.getParameter("name");
out.println(" Hello Mr." + nom);%>
<p></p>
<a href="updateContact.jsp">Update Contact</a>
<a href="searchContact.jsp">Search Contact</a>
<a href="createContact.jsp">Create Contact</a>
</body>
</html>