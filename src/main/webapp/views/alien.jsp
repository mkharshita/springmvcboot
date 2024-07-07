<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring MVC</title>
</head>
<body>
Welcome!
<form action="addAlien" method="post">
    <label for="id">Enter your Id:</label>
    <input type="text" id="id" name="id" required>
    <br>
    <label for="name">Enter your Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
