<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar bg-light navbar-light">
    <a href="" class="navbar-brand mx-4 mb-3">
        <h3 class="text-primary"><i class="fa fa-hashtag me-2"></i>管理系统</h3>
    </a>
    <div class="d-flex align-items-center ms-4 mb-4">
        <div class="position-relative">
            <img class="rounded-circle" src="${pageContext.request.contextPath}/static/picture/user.jpg" alt="" style="width: 40px; height: 40px;">
            <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1"></div>
        </div>
        <div class="ms-3">
            <h6 class="mb-0">${USER123.userName}</h6>
            <span>老师</span>
        </div>
    </div>

    <div class="navbar-nav w-100">
        <a href="index" class="nav-item nav-link active"><i class="fa fa-tachometer-alt me-2"></i>打卡记录</a>
        <a href="index2" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>校内消息</a>
        <a href="index3" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="far fa-file-alt me-2"></i>学期评价</a>
    </div>
</nav>