<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring MVC</title>
</head>
<body>
    Welcome!
    <form action="add" method="post">
        <label for="number1">Number 1:</label>
        <input type="text" id="number1" name="number1" required>
        <br>
        <label for="number2">Number 2:</label>
        <input type="text" id="number2" name="number2" required>
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
