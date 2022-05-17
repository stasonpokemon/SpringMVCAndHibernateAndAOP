<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: a123
  Date: 11.05.22
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee info</title>
</head>
<body>
<h2>Employee Info</h2>
<br>
<form:form action="/saveEmployee" modelAttribute="employee">
    <form:hidden path="id"/>


    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Department: <form:input path="department"/>
    <form:errors path="department"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    <input type="submit" value="Save">
</form:form>


</body>
</html>
