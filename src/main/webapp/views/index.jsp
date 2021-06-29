<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to the Spring Boot
<br>
<form action="addAlien">

Enter Id: <input type="text" name="Aid">
Enter Name: <input type="text" name="Name">
<br>
<input type="submit" value="Add Alien">
</form>

<br><br><br>
<form action="getAlien">

Enter Id: <input type="text" name="Aid"><br><br>

<br>
<input type="submit">
</form>

<br><br><br>
<form action="getAlienByName">

Enter Name: <input type="text" name="Name"><br><br>

<br>
<input type="submit">
</form>


</body>
</html>