<%-- 
    Document   : supplierView
    Created on : Aug 17, 2015, 10:34:05 PM
    Author     : kmhasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="supplier" scope="request" class="bd.ac.seu.pos.Supplier" />
<jsp:useBean id="suppliers" scope="request" class="java.util.List" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supplier Added</title>
    </head>
    <body>
        <div>Added supplier: </div>
        <table>
            <tr><td>ID:</td><td><jsp:getProperty name="supplier" property="supplierId" /></td></tr>
            <tr><td>Name:</td><td><jsp:getProperty name="supplier" property="supplierName" /></td></tr>
            <tr><td>Address:</td><td><jsp:getProperty name="supplier" property="supplierAddress" /></td></tr>
        </table>
        <a href="index.html">Add more suppliers</a>
        <br />
        <div>List of all suppliers:</div>
        <table>
            <tr><th>Supplier Id</th><th>Supplier Name</th><th>Supplier Address</th></tr>
            <c:forEach items="${suppliers}" var="s">
                <tr>
                    <td>${s.supplierId}</td>
                    <td>${s.supplierName}</td>
                    <td>${s.supplierAddress}</td>
                </tr>
            </c:forEach>
        </table>            
    </body>
</html>
