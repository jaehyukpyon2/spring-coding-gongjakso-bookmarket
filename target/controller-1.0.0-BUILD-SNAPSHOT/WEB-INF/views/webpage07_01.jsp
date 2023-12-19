<%@ page contentType="text/html;charset=UTF-8" language="java"
         trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form Tag</title>
</head>
<body>
    <h3>회원가입</h3>
    <form:form modelAttribute="member" method="post">
        <p>아이디: <form:input path="id" name="id" type="number" /></p>
        <p>비밀번호: <form:password path="password"/></p>
        <p>거주지:
            <form:select path="city">
                <form:option value="서울시">서울시</form:option>
                <form:option value="경기도">경기도</form:option>
                <form:option value="인천시">인천시</form:option>
                <form:option value="충청도">충청도</form:option>
                <form:option value="전라도">전라도</form:option>
                <form:option value="경상도">경상도</form:option>
            </form:select>
        </p>
        <p>
            성별: <form:radiobutton path="sex" value="남성" />남성
            <form:radiobutton path="sex" value="여성" />여성
<%--            성별 선택 아예 안 하면, 서버쪽에는 그냥 null 찍힘--%>
        </p>
        <p>
            취미: 독서<form:checkbox path="hobby" value="독서" />
            운동<form:checkbox path="hobby" value="운동" />
            영화<form:checkbox path="hobby" value="영화" />
<%--            취미 선택 안 하면, 그래도 length가 0인 String 배열은 생성 된다. null은 아님--%>
        </p>
        <p>
            <input type="submit" value="가입하기">
            <input type="reset" value="다시쓰기">
        </p>
    </form:form>
</body>
</html>
