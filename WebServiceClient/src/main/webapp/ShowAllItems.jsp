<%-- 
    Document   : ShowAllItems
    Created on : 23 Jun, 2021, 8:16:19 PM
    Author     : macbookair
--%>

<%@page import="java.util.List"%>
<%@page import="com.myservice.Items"%>
<%@page import="com.myservice.InventoryServiceService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div align="center">
        <h1>All Items</h1>
        <br><br>
        
           <table border="1">
               <tr> <th>Sr.</th> <th>Name</th><th>Price</th><th>Quantity</th></tr>
        <%
            int i =1;
        InventoryServiceService inventoryServiceService = new InventoryServiceService();
        List<Items> items= inventoryServiceService.getInventoryServicePort().getAllItems();
        for(Items e : items)
        {
        %>
               <tr><td><%=i++%></td><td><%=e.getName()%></td><td><%=e.getPrice()%></td><td><%=e.getQuantity()%></td>
                  </tr>
     
               <%}%>
            
        </table>
       </div>
    </body>
</html>
