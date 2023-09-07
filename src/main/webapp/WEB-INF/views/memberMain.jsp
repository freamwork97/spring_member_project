<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/main.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<%@include file="component/header.jsp" %>
<%@include file="component/nav.jsp" %>
<h2>memberMain.jsp</h2>
model에 담은정보: ${member} <br>
로그인이메일: ${sessionScope.loginEmail} <br>
<button class="btn btn-primary" onclick="update_fn()">회원정보수정</button>

<%--로그인 계정이 admin일 경우에만 회원목록 링크 보임--%>
<c:if test="${sessionScope.loginEmail=='admin'}">
    <a href="/members">회원목록</a>
</c:if>
<a href="/logout">로그아웃</a>
<a href="/">index로 이동</a>
<%@include file="component/footer.jsp" %>

</body>
<script>
   const update_fn = () => {
       location.href = "/update";
   }
</script>
</html>