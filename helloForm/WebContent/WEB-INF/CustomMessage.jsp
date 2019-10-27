<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Message</title>
</head>
<body>
	<h1 style="text-align: center;
    padding: 20px;
    background-color: black;
    color: white;">
    <%=request.getAttribute("customMessage")%></h1>

</body>
</html>