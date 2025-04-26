<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>主页</title>

    <jsp:include page="css.jsp"/>

</head>

<body>

<jsp:include page="topMenu.jsp"/>
<main role="main">


    <section class="mt-4 mb-5">
        <div class="container mb-4">
            <h1 class="font-weight-bold title">探索属于你的艺术</h1>
            <div class="row">
                <nav class="navbar navbar-expand-lg navbar-light bg-white pl-2 pr-2">
                    <div class="collapse navbar-collapse" id="navbarsExplore">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="#">生活品味</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">美食</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">家庭</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">旅行</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多</a>
                                <div class="dropdown-menu shadow-lg" aria-labelledby="dropdown01">
                                    <a class="dropdown-item" href="#">科技</a>
                                    <a class="dropdown-item" href="#">自然</a>
                                    <a class="dropdown-item" href="#">厨艺</a>
                                    <a class="dropdown-item" href="#">宇宙</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div><%--分类菜单栏--%>
        <div class="container-fluid">
            <div class="row">
                <div class="card-columns">
                    <c:forEach items="${cardList}" var="item">
                        <div class="card card-pin">
                            <img class="card-img" src="assets/img/card/${item.cardImg}" alt="Card image">
                            <div class="overlay">
                                <h2 class="card-title title">${item.cardTitle}</h2>
                                <div class="more">
                                    <a href="card">
                                        <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i>更多</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1512355144108-e94a235b10af?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=c622d56d975113a08c71c912618b5f83&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">老式时尚</h2>
                            <div class="more">
                                <a href="card">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i>更多</a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1518542331925-4e91e9aa0074?ixlib=rb-0.3.5&s=6958cfb3469de1e681bf17587bed53be&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="card">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i>更多</a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1513028179155-324cfec2566c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=32ce1df4016dadc177d6fce1b2df2429&auto=format&fit=crop&w=350&q=80" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1516601255109-506725109807?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=ce4f3db9818f60686e8e9b62d4920ce5&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1509233631037-deb7efd36207?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=75a5d784cdfc8f5ced8a6fe26c6d921e&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1416879595882-3373a0480b5b?ixlib=rb-0.3.5&s=c0043ea5aa03f62a294636f93725dd6e&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1485627658391-1365e4e0dbfe?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=976b0db5c3c2b9932bb20e72f98f9b61&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1502550900787-e956c314a221?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=e90f191de3a03c2002ac82c009490e07&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1466692476868-aef1dfb1e735?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=9e3cd6ce6496c9c05cbf1b6cda8be0f9&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1509885903707-b68568db61ed?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=5f11503655b51165836c2dcefa51a040&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1518707399486-6d702a84ff00?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b5bb16fa7eaed1a1ed47614488f7588d&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1519408299519-b7a0274f7d67?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d4891b98f4554cc55eab1e4a923cbdb1&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                        <img class="card-img" src="https://images.unsplash.com/photo-1506706435692-290e0c5b4505?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=0bb464bb1ceea5155bc079c4f50bc36a&auto=format&fit=crop&w=500&q=60" alt="Card image">
                        <div class="overlay">
                            <h2 class="card-title title">Cool Title</h2>
                            <div class="more">
                                <a href="post.html">
                                    <i class="fa fa-arrow-circle-o-right" aria-hidden="true"></i> More </a>
                            </div>
                        </div>
                    </div>
                    <div class="card card-pin">
                </div>
            </div>
        </div><%--首页内容--%>
    </section>

</main>

<jsp:include page="js.jsp"/>


</body>

</html>
