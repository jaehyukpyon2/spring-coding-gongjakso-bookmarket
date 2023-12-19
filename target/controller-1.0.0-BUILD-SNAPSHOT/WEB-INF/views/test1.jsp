<%@ page contentType="text/html;charset=UTF-8" language="java"
         trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="dataBean" action='result'>
        <form:select path="a1">
            <form:option value="data1">항목1</form:option>
            <form:option value="data2">항목2</form:option>
            <form:option value="data3">항목3</form:option>
        </form:select>
    </form:form>
</body>
</html>
