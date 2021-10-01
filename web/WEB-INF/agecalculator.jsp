<%-- 
    Document   : agecalculator
    Created on : Sep 30, 2021, 1:21:25 PM
    Author     : 854638
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculators</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="POST" action="age">
            <label>Enter your age: </label>
            <input type="text" name="age" value="${user_age}">
            <br>
            <input type="submit" value="Age next birthday">
            
        </form>
        <P>${message}</p>
        
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
