<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<<<<<<< HEAD
<html lang="en">
=======
<html>
>>>>>>> origin/main
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
<<<<<<< HEAD
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <jsp:include page="css.jsp"/>
</head>
<body>
    <div id="loginbox"  >
        <form id="loginform" class="form-vertical" action="login" method="post">
            <div class="control-group normal_text"> <h3><img src="static/img/logo.png" alt="Logo" /></h3></div>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_lg"><i class="icon-user"></i></span><input type="text" name="userCode" placeholder="用户编号" />
                    </div>
                </div>
            </div><%--用户名--%>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly"><i class="icon-lock"></i></span><input type="password" name="userPassword" placeholder="用户密码" />
                    </div>
                </div>
            </div><%--密码--%>
            <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-danger" id="to-recover">忘记密码?</a></span>
                <button type="submit" value="登录" class="pull-right btn btn-success">登录</button>
            </div><%--忘记密码/提交登录--%>
            <span class="text-center" style="color: red">${message}</span>
        </form>

        <form id="recoverform" action="retrievePassword" class="form-vertical" method="post"><%--忘记密码页面--%>
            <p class="normal_text">请输出用户编号</p>
            <div class="controls">
                <div class="main_input_box">
                    <span class="add-on bg_lo"><i class="icon-envelope"></i></span><input type="text" placeholder="用户编号" />
                </div>
            </div><%--用户编号--%>

            <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo; 返回登录</a></span>
                <span class="pull-right"><a class="btn btn-info">下一步</a></span>
            </div><%--提交编号--%>
        </form>

    </div>
</body>
    <jsp:include page="js.jsp"/>
</html>
=======
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
>>>>>>> origin/main
