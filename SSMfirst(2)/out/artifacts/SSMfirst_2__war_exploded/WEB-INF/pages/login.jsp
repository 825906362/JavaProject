<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>登录页面</title>
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
