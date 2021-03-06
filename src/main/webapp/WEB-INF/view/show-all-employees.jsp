<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: a123
  Date: 11.05.22
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All employees</title>
</head>
<body>
<h2>All employees</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <s:forEach var="employee" items="${employees}">

        <s:url var="updateButton" value="/editEmployee">
            <s:param name="employeeId" value="${employee.id}"/>
        </s:url>
        <s:url var="deleteButton" value="/deleteEmployee">
            <s:param name="employeeId" value="${employee.id}"/>
        </s:url>
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
            <td>
                <input type="button" value="update" onclick="window.location.href = '${updateButton}'">
                <input type="button" value="delete" onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>
    </s:forEach>
</table>
<br>

<input type="button" value="add"
       onclick="window.location.href = '/addNewEmployee'">
</body>
</html>
