<%-- 
    Document   : Lab1
    Created on : 08.04.2021, 15:31:56
    Author     : Alex
--%>
<%@page import="fit.knu.ua.TA.Lab1"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! Lab1 lab1 = new Lab1(150); %>
         <p><%= lab1.toString() %></p>
          <%lab1.IncreaseNumber(33);%>
          <p><%= lab1.toString() %></p>
          <%lab1.DecreaseNumber(60);%>
          <p><%= lab1.toString() %></p>
          
       
        
    </body>
</html>
