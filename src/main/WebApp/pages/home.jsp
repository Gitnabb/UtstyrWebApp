<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Utstyr webapp</title>
</head>
<body>

<h1> Java Spring </h1>


<br>

<form action="addUser">
    <input type="text" name = userID><br>
    <input type="text" name = userName>
    <input type="submit"> <br>

</form>


<h3> Welcome ${userObject.userID} , ${userObject.userName} , ${userObject.language}</h3>

</body>
</html>