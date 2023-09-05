<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib
        prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
        crossorigin="anonymous"
/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>학생목록</h2>
<table class="table table-dark table-striped">
    <tr>
        <td>아이디</td>
        <td>이메일</td>
        <td>비밀번호</td>
        <td>이름</td>
        <td>생년월일</td>
        <td>전화번호</td>
    </tr>
    <c:forEach items="${memberList}" var="member">
        <tr>
            <td>${member.id}</td>
            <td>${member.memberEmail}</td>
            <td>${member.memberPassword}</td>
            <td>${member.memberName}</td>
            <td>${member.memberBirth}</td>
            <td>${member.memberMobile}</td>

        </tr>
    </c:forEach>
</table>
</body>

</html>
