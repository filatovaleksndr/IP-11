<%-- 
    Document   : lab2
    Created on : 08.04.2021, 20:28:25
    Author     : Alex
--%>
<%@page import="fit.knu.ua.TA.Lab2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%! Lab2 lab2 = new Lab2(4, 5, 7, 3);%>
         <p>a = <%= lab2.getA()%></p>
         <p>b = <%= lab2.getB()%></p>
         <p>c = <%= lab2.getC()%></p>
         <p>x = <%= lab2.getX()%></p>
         <p>result = <%= lab2.CalculateFormula()%></p>
    </body>
</html>
