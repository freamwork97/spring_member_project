<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/main.css">
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <style>
        #section {
            margin: auto;
        }
    </style>
</head>
<body>
<%@include file="component/header.jsp" %>
<%@include file="component/nav.jsp" %>
<div id="section" class="row">
    <div class="col">
        <form action="/save" method="post">
            <input id="key" class="form-control" type="text" name="memberEmail" placeholder="이메일" onkeyup="fun5()"> <br>
            <p id="check-result"></p>
            <input type="text" name="memberPassword" placeholder="비밀번호"> <br>
            <input type="text" name="memberName" placeholder="이름"> <br>
            <input type="text" name="memberBirth" placeholder="생년월일(YYYYMMDD)"> <br>
            <input type="text" name="memberMobile" placeholder="전화번호"> <br>
            <input type="submit" value="회원가입">
        </form>
    </div>

</div>
<%@include file="component/footer.jsp" %>

</body>

<script>
    const email_dup_check = () => {
        const email = document.getElementById("key").value;
        const result = document.getElementById("check-result");
        $.ajax({
            type: "post",
            url: "/duplicate-check",
            data: {
                memberEmail: email
            },
            success: function () {
                result.innerHTML = "사용가능한 이메일입니다.";
                result.style.color = "green";
            },
            error: function () {
                result.innerHTML = "이미 사용 중인 이메일입니다.";
                result.style.color = "red";
            }
        });
    }
</script>
</html>