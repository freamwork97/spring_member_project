<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="nav">
    <ul class="menu">
        <li class="menu-item">
            <a href="/">index</a>
        </li>
        <li class="menu-item" id="login-area1">
            <%--            <a href="/save">회원가입</a>--%>
        </li>
        <li class="menu-item" id="login-area2">
            <%--            <a href="/members">회원목록</a>--%>
        </li>
        <!-- 로그인 여부에 따라 로그인했으면 oo님 환영합니다. 로그아웃링크 보이고
             로그인 하지 않았으면 로그인 이 보이도록
        -->
        <li class="menu-item" id="login-area3">

        </li>
    </ul>
</div>
<script>
    const loginArea1 = document.getElementById("login-area1");
    const loginArea2 = document.getElementById("login-area2");
    const loginArea3 = document.getElementById("login-area3");
    const loginEmail = '${sessionScope.loginEmail}';
    console.log(loginEmail.length);
    if (loginEmail.length != 0) {
        // 로그인 했음
        if (loginEmail == "admin") {
            loginArea1.innerHTML = "<a href='/members'>회원목록</a>";

        }
        loginArea2.innerHTML = "<a href='/mypage'>" + loginEmail + "님 환영해요!</a>";
        loginArea3.innerHTML = "<a href='/logout'>logout</a>";

    } else {
        // 로그인 안했음
        loginArea1.innerHTML = "<a href='/save'>회원가입</a>";
        loginArea2.innerHTML = "<a href='/login'>로그인</a>";
    }
</script>