<%-- 
    Document   : AddNewItem
    Created on : 23 Jun, 2021, 8:38:01 PM
    Author     : macbookair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <h1>Enter Product Detail</h1><br>
        <form action="additem.jsp">
            <table>
                <tr><td>Name:</td><td> <Input type="text" name ="iname"></td></tr>
                <tr><td>Price:</td><td> <input type="text" name ="price"></td></tr>
                <tr> <td>Qty: </td><td><input type ="text" name="qty"></td></tr>
                <tr><td></td><td> <input type="submit"></td></tr>
        </form>
</table>
        </div>
    </body>
</html>
