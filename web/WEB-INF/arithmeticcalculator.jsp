<%-- 
    Document   : arithmeticcalculator
    Created on : Jun 2, 2022, 11:13:34 AM
    Author     : Paolo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
 <h1>Age Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${firstValue}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${secondValue}">
            <br>
            <br><br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">
            <input type="submit" name="operator" value="%">
                        
        </form>
            <p>Result: ${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
