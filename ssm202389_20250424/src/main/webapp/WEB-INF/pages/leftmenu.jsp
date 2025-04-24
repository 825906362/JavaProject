<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="sidebar pe-4 pb-3">
    <nav class="navbar bg-light navbar-light">
        <a href="" class="navbar-brand mx-4 mb-3">
            <h3 class="text-primary"><i class="fa fa-hashtag me-2"></i>图书管理</h3>
        </a>
        <div class="d-flex align-items-center ms-4 mb-4">
            <div class="position-relative">
                <img class="rounded-circle" src="static/picture/user.jpg" alt="" style="width: 40px; height: 40px;">
                <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1"></div>
            </div>
            <div class="ms-3">
                <h6 class="mb-0">${USERSESSION.userName}</h6>
                <span>${USERSESSION.userCode}</span>
            </div>
        </div>
        <div class="navbar-nav w-100">
            <a href="${pageContext.request.contextPath}\index" class="nav-item nav-link active"><i class="fa fa-tachometer-alt me-2"></i>系统首页</a>
            <div class="nav-item dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>管理栏目</a>
                <div class="dropdown-menu bg-transparent border-0">
                    <a href="${pageContext.request.contextPath}\book" class="dropdown-item"><i class="fa fa-ship me-2"></i>  图书管理</a>
                </div>
            </div>
        </div>
    </nav>
</div>