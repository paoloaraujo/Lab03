<%-- 
    Document   : agecalculator
    Created on : May 26, 2022, 10:59:08 AM
    Author     : Paolo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="${age}">
            <br>
            <br><br>
            <input type="submit" value="Age next birthday">
                        
        </form>
        <p>${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
