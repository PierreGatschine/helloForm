<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello form</title>
</head>
<body>
	<form action="/hello/helloForm" method="post">
		<labe>Prenom</labe><br>
	    <input type="text" name="firstName" ><br>
	    <labe>Nom</labe><br>
	    <input type="text" name="lastName" ><br>
	    <labe>Heure de la journée</labe><br>
	    <input type="time" name="time" ><br><br>
	    <input type="submit" name="time" ><br>
	</form>

</body>
</html>