<%-- 
    Document   : additem
    Created on : 23 Jun, 2021, 8:40:39 PM
    Author     : macbookair
--%>

<%@page import="com.myservice.InventoryServiceService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String name = request.getParameter("iname");
        String price = request.getParameter("price");
        String qty = request.getParameter("qty");
       
        
        InventoryServiceService inventoryServiceService = new InventoryServiceService();
        inventoryServiceService.getInventoryServicePort().insertItem(name, Double.parseDouble(price), qty);
        
        response.sendRedirect("/AdminDashboard.jsp");
        %>
    </body>
</html>
