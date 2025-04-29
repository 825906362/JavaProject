<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <jsp:include page="css.jsp"/>
</head>
<body>
<div class="container-fluid position-relative bg-white d-flex p-0">

    <div class="container-fluid">
        <div class="row h-100 align-items-center justify-content-center" style="min-height: 100vh;">
            <div class="col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4">
                <div class="bg-light rounded p-4 p-sm-5 my-4 mx-3">
                    <div class="d-flex align-items-center justify-content-between mb-3">
                        <h3 class="text-success text-center"><i class="fa fa-lock"></i>用户登录</h3>
                    </div>
                    <form action="login" method="post">
                        <div class="form-floating mb-3">
                            <input type="text" class="form-control" name="userCode" id="floatingInput" placeholder="用户编号">
                            <label for="floatingInput">用户编号</label>
                        </div>
                        <div class="form-floating mb-4">
                            <input type="password" class="form-control" name="userPassword" id="floatingPassword" placeholder="用户密码">
                            <label for="floatingPassword">用户密码</label>
                        </div>
                        <div class="d-flex align-items-center justify-content-between mb-4">
                            <span style="color: red">${message}</span>
                        </div>
                        <button type="submit" value="登录" class="btn btn-success py-3 w-100 mb-4">登录</button>
                        <p class="text-center mb-0">还没有账户？ <a href="toPage/register">注册</a></p>
                    </form>
                </div>
            </div>
        </div>
    </div>

</div>

<jsp:include page="js.jsp"/>
</body>
</html>