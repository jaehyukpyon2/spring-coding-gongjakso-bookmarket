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
    <form method="post" action="${pageContext.request.contextPath}/member-test">
        아이디: <input type="number" name="id" /><br/>
        비밀번호: <input type="text" name="password" /><br/>
        도시: <input type="text" name="city" /><br/>
        <input type="radio" value="남자" name="sex" />남자<br/>
        <input type="radio" value="여자" name="sex" />여자<br />
        <input type="checkbox" value="독서" name="hobby" />독서
        <input type="checkbox" value="게임" name="hobby" />게임
        <input type="checkbox" value="기타" name="hobby" />기타

        <br/>
        <input type="submit" value="submit!">
    </form>
</body>
</html>
