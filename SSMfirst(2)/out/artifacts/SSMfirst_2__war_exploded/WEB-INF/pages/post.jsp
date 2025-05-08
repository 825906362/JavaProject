<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>发布投稿</title>
    <jsp:include page="css.jsp"/>

</head>

<body>

<jsp:include page="topMenu.jsp"/>

<main role="main">
    <section class="bg-gray200 pt-5 pb-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-7">
                    <article class="card">
                        <div class="card-body">
                            <h1 class="card-title display-4 text-center"> 输入您独特的卡片！ </h1>
                        </div>
                        <form action="postFile" method="post">
                            <div class="form-group">
                                <label for="cardType">卡片类型</label>
                                <input type="text" class="form-control" name="cardType" id="cardType" placeholder="生活品味">
                            </div>
                            <div class="form-group">
                                <label for="cardTitle">卡片标题</label>
                                <input type="text" class="form-control" name="cardTitle" id="cardTitle" placeholder="中国人必须知道的常识">
                            </div>
                            <div class="form-group">
                                <label for="cardContent">文章内容</label>
                                <textarea class="form-control" name="cardContent" id="cardContent" rows="3"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="cardTime">发布时间</label>
                                <input type="datetime-local" class="form-control" name="cardTime" id="cardTime" placeholder="众所周知...">
                            </div>
                            <%--这个地方因为数据库里面图片那一列不能为空，而提交上去为空，所以出bug
                            并且数据库无法直接保存图片内容，所以就算保存之后也无法正确显示--%>
                            <div class="form-group">
                                <label for="cardImg">选择图片</label>
                                <input type="text" class="form-control-file" id="cardImg">
                            </div>
                            <input type="hidden" name="userId" value="${USERSESSION.userId}"><%--隐藏提交userId--%>
                            <button type="submit"  value="提交" class="btn btn-primary">提交</button>
                        </form>
                        <span type="text" style="color: red">${PostMessage}</span>
                    </article>
                </div>
            </div>
        </div>
        <div class="container-fluid mt-5">
            <div class="row">
                <h5 class="font-weight-bold">更多相似</h5>
                <div class="card-columns">
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1518707399486-6d702a84ff00?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b5bb16fa7eaed1a1ed47614488f7588d&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1519408299519-b7a0274f7d67?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d4891b98f4554cc55eab1e4a923cbdb1&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1506706435692-290e0c5b4505?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=0bb464bb1ceea5155bc079c4f50bc36a&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1512355144108-e94a235b10af?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=c622d56d975113a08c71c912618b5f83&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1518542331925-4e91e9aa0074?ixlib=rb-0.3.5&s=6958cfb3469de1e681bf17587bed53be&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1513028179155-324cfec2566c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=32ce1df4016dadc177d6fce1b2df2429&auto=format&fit=crop&w=350&q=80" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1516601255109-506725109807?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=ce4f3db9818f60686e8e9b62d4920ce5&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1505210512658-3ae58ae08744?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2ef2e23adda7b89a804cf232f57e3ca3&auto=format&fit=crop&w=333&q=80" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1488353816557-87cd574cea04?ixlib=rb-0.3.5&s=06371203b2e3ad3e241c45f4e149a1b3&auto=format&fit=crop&w=334&q=80" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1518450757707-d21c8c53c8df?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=c88b5f311958f841525fdb01ab3b5deb&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Some Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

</main>

<script src="assets/js/app.js"></script>
<script src="assets/js/theme.js"></script>

<footer class="footer pt-5 pb-5 text-center">

    <div class="container">

        <div class="socials-media">

            <ul class="list-unstyled">
                <li class="d-inline-block ml-1 mr-1"><a href="#" class="text-dark"><i class="fa fa-facebook"></i></a></li>
                <li class="d-inline-block ml-1 mr-1"><a href="#" class="text-dark"><i class="fa fa-twitter"></i></a></li>
                <li class="d-inline-block ml-1 mr-1"><a href="#" class="text-dark"><i class="fa fa-instagram"></i></a></li>
                <li class="d-inline-block ml-1 mr-1"><a href="#" class="text-dark"><i class="fa fa-google-plus"></i></a></li>
                <li class="d-inline-block ml-1 mr-1"><a href="#" class="text-dark"><i class="fa fa-behance"></i></a></li>
                <li class="d-inline-block ml-1 mr-1"><a href="#" class="text-dark"><i class="fa fa-dribbble"></i></a></li>
            </ul>

        </div>


        <p>©  <span class="credits font-weight-bold">
            <a target="_blank" class="text-dark" href="https://www.wowthemes.net/pintereso-free-html-bootstrap-template/"><u>Pintereso Bootstrap HTML Template</u> by WowThemes.net.</a>
          </span>
        </p>


    </div>

</footer>
</body>

</html>
