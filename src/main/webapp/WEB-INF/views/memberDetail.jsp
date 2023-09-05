<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>상세정보</h2>
<td>회원정보:${member}</td> <br>
<td>이메일:${member.memberEmail}</td> <br>
<td>비밀번호:${member.memberPassword}</td> <br>
<td>이름:${member.memberName}</td> <br>
<td>생년월일:${member.memberBirth}</td> <br>
<td>전화번호:${member.memberMobile}</td> <br>
<td>
    <button onclick="update_fn('${member.id}')">수정</button>
</td>
<td>
    <button onclick="delete_fn('${member.id}')">삭제</button>
</td>
</body>

<script>

    const update_fn = (id) => {
        location.href = "/update?id=" + id;
    };

    const delete_fn = (id) => {
        location.href = "/delete?id=" + id;
    };
</script>
</html>
