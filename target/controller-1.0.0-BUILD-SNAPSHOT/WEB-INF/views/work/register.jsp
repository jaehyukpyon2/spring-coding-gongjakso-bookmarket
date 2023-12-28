<%@ page contentType="text/html;charset=UTF-8" language="java"
         trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="member" method="post" action="${pageContext.request.contextPath}/user/register">
    <table>
        <thead>
        <tr>
            <th>종류</th>
            <th>입력</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>아이디</td>
            <td>
                <form:input path="userid"/>
                <form:errors path="userid" />
            </td>
        </tr>
        <tr>
            <td>이름</td>
            <td>
                <form:input path="username"/>
                <form:errors path="username" />
            </td>
        </tr>
        <tr>
            <td>나이</td>
            <td>
                <form:input path="age" type="number"/>
                <form:errors path="age" />
            </td>
        </tr>
        <tr>
            <td>이메일</td>
            <td>
                <form:input path="email"/>
                <form:errors path="email"/>
            </td>
        </tr>
        </tbody>
    </table>
    <hr><br>
    <input type="submit" value="회원가입하기">
</form:form>
</body>
</html>
