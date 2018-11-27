<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Modification</h3>
	<form method="post" action="CreateServlet">
		First Name: <input type="text" name="firstName" size="25">
		Last Name: <input type="text" name="lastName" size="25">
		Email: <input type="text" name="email" size="25">
		<p></p>
		<input type="submit"
		value="Submit">
		<input type="reset"
		value="Reset">
	</form>
</body>
</html>