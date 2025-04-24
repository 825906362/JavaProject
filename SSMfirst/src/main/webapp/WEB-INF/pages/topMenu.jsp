<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0">
    <form class="d-none d-md-flex ms-4">
        <input class="form-control border-0" type="search" placeholder="搜索内容">
    </form>
    <div class="navbar-nav align-items-center ms-auto">
        <div class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                <img class="rounded-circle me-lg-2" src="${pageContext.request.contextPath}/static/picture/user.jpg" alt="" style="width: 40px; height: 40px;">
                <span class="d-none d-lg-inline-flex">${USER123.userName}</span>
            </a>
            <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
                <a href="#" class="dropdown-item">个人主页</a>
                <a href="#" class="dropdown-item">账号管理</a>
                <a href="#" class="dropdown-item">退出登录</a>
            </div>
        </div>
    </div>
</nav>