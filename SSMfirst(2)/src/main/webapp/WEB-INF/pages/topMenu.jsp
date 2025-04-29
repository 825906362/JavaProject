<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<<<<<< HEAD
<div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav">
        <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i><span class="text">欢迎${USER123.userName}</span><b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="#"><i class="icon-user"></i> 我的资料</a></li>
                <li class="divider"></li>
                <li><a href="#"><i class="icon-check"></i> 我的任务</a></li>
                <li class="divider"></li>
                <li><a href="login.html"><i class="icon-key"></i> 退出</a></li>
            </ul>
        </li>
        <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">消息</span> <span class="label label-important">5</span> <b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> 新消息</a></li>
                <li class="divider"></li>
                <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> 收件箱</a></li>
                <li class="divider"></li>
                <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> 发件箱</a></li>
                <li class="divider"></li>
                <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> 发送</a></li>
            </ul>
        </li>
        <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">设置</span></a></li>
        <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">退出</span></a></li>
    </ul>
</div>
<div id="search">
    <input type="text" placeholder="输入搜索内容..."/>
    <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
=======
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
>>>>>>> origin/main
