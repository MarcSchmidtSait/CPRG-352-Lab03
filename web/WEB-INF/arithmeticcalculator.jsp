<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 30, 2021, 5:33:03 PM
    Author     : 854638
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="POST" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first_num" value="${user_first}"
                   <br><br>
            <label>Second: </label>
            <input type="text" name="second_num" value="${user_second}">
            <br>
            <input type="submit" name="button" value="+"></input>
            <input type="submit" name="button" value="-"></input>
            <input type="submit" name="button" value="*"></input>
            <input type="submit" name="button" value="%"></input>
        </form>
            <p>${message}</p>
            <a href="age">Age Calculator</a>
    </body>
</html>
