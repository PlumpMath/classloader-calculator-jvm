<%@page import="com.abiewska.jvm.App"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator</title>
</head>
<body>
	<h2>Kalkulator</h2>
	<%
		App app = new App();
	%>
	<p>
		<%
			out.println("Liczba       : " + app.number);
		%>
	</p>
	<p>
		<%
			out.println("Zaokrąglona liczba : " + app.round);
		%>
	</p>
</body>
</html>
