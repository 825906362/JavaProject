<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<nav class="navbar navbar-expand-lg navbar-light bg-white fixed-top">
    <a class="navbar-brand font-weight-bolder mr-3" href="index"><img src="${pageContext.request.contextPath}/assets/img/logo3.png" width="40"></a>
    <div class="collapse navbar-collapse" id="navbarsDefault">
        <ul class="navbar-nav mr-auto align-items-center">
            <form class="bd-search hidden-sm-down"><%--没有action和method--%>
                <input type="text" class="form-control bg-graylight border-0 font-weight-bold" id="search-input" placeholder="搜索..." autocomplete="off">
                <div class="dropdown-menu bd-search-results" id="search-results">
                </div>
            </form>
        </ul>
        <ul class="navbar-nav ml-auto align-items-center">
            <li class="nav-item">
                <a class="nav-link active" href="index">主页</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="post">发布投稿</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="post2">投稿列表</a>
            </li>
            <li class="nav-item">
                <c:if test="${USERSESSION != null}">
                    <a class="nav-link" href=""><img class="rounded-circle mr-2" src="${pageContext.request.contextPath}/assets/img/av.jpg" width="30"></a>
                </c:if>
                <c:if test="${USERSESSION == null}">
                    <a class="nav-link" href=""><img class="rounded-circle mr-2" src="${pageContext.request.contextPath}/assets/img/logo.png" width="30"></a>
                </c:if>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link" href="#" id="dropdown02" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <svg style="margin-top:10px;" class="_3DJPT" version="1.1" viewbox="0 0 32 32" width="21" height="21" aria-hidden="false" data-reactid="71"><path d="M7 15.5c0 1.9-1.6 3.5-3.5 3.5s-3.5-1.6-3.5-3.5 1.6-3.5 3.5-3.5 3.5 1.6 3.5 3.5zm21.5-3.5c-1.9 0-3.5 1.6-3.5 3.5s1.6 3.5 3.5 3.5 3.5-1.6 3.5-3.5-1.6-3.5-3.5-3.5zm-12.5 0c-1.9 0-3.5 1.6-3.5 3.5s1.6 3.5 3.5 3.5 3.5-1.6 3.5-3.5-1.6-3.5-3.5-3.5z" data-reactid="22"></path></svg>
                </a>
                <div class="dropdown-menu dropdown-menu-right shadow-lg" aria-labelledby="dropdown02" style="width: 200px;">
                    <ul class="list-group list-group-flush">
                        <c:if test="${USERSESSION == null}">
                            <h4 class="dropdown-header display-4 text-center" style="color: #bd081c">未登录</h4>
                            <a href="login" class="btn btn btn-outline-primary" role="button">登录</a>
                        </c:if>
                        <c:if test="${USERSESSION != null}">
                            <h4 class="dropdown-header display-4 text-center" style="color: #bd081c">欢迎 ${USERSESSION.userName}</h4>
                            <a href="login" class="btn btn btn-outline-primary" role="button">切换账号</a>
                            <a href="login" class="btn btn btn-outline-primary" role="button">退出登录</a>
                        </c:if>
                    </ul>
                </div>
            </li>
        </ul>
    </div>
</nav>
