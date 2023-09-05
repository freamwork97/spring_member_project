<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-05
  Time: 오전 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>로그인</h2>
<form action="/login" method="post" class="card mx-5 p-3">
    이메일: <input type="text" name="memberEmail" /> <br />
    비밀번호: <input type="text" name="memberPassword" /> <br />
    <input type="submit" value="전송" class="btn btn-primary" />
</form>
</body>
</html>
