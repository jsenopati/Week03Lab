<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 10:00:19 PM
    Author     : jsenopati
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
        <form method="post" action="ageCalc">
            Enter your age: <input type="text" name="currentAge" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
    </body>
</html>
