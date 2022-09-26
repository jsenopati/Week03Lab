<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Sep-2022, 10:19:10 PM
    Author     : jsenopati
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
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value="${firstNum}"><br>
            Second: <input type="text" name="secondNum" value="${secondNum}"><br>
            <button type="submit" name="math" value="add">+</button>
            <button type="submit" name="math" value="subtract">-</button>
            <button type="submit" name="math" value="multiply">*</button>
            <button type="submit" name="math" value="divide">%</button>
        </form>
        <br>
        Result: ${result} <br>
        <a href="./age">Age Calculator</a>
    </body>
</html>
