<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-05
  Time: 오전 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h2>회원 수정</h2>
<form action="/update" method="post" class="card mx-5 p-3">
    <input type="hidden" name="id" value="${member.id}"> <br>
    이름: <input type="text" name="memberName" value="${member.memberName}" readonly /> <br />
    생년월일: <input type="text" name="memberBirth" value= "${member.memberBirth}" readonly  /> <br />
    이메일: <input type="text" name="memberEmail" value= "${member.memberEmail}" readonly  /> <br />
    비밀번호: <input type="text" name="memberPassword"/> <br />
    전화번호: <input type="text" name="memberMobile"/> <br />
    <input type="submit" value="전송" class="btn btn-primary" />
</form>
</body>


</html>
