<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>注册页面</title>
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
                        <h3 class="text-danger text-center"><i class="fa fa-lock"></i>用户注册</h3>
                    </div>
                    <form action="register" method="post">
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
                        <button type="submit" value="注册" class="btn btn-danger py-3 w-100 mb-4">注册</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

</div>

<jsp:include page="js.jsp"/>
</body>
</html>