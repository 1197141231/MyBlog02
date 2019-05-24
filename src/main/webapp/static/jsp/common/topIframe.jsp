<%--
  Created by IntelliJ IDEA.
  User: Client01
  Date: 2019/3/11
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <title>主页头</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
        .fakeimg {
            height: 200px;
            background: #aaa;
        }
    </style>
</head>
<body>
<div   class="jumbotron text-center" style="margin-bottom:0; background-image: url(${pageContext.request.contextPath }/static/img/timg.jpg);background-size:cover" >
    <!-- 外层jpg图片  ../../timg.jpg       ../img/timg.jpg-->
    <h1></h1>
    <p>love life , love dream!</p>
</div>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/login/toLogin">网站名</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">主页</a></li>
                <li><a href="../../static/jsp/article.jsp">文章</a></li>
                <li><a href="../../static/jsp/article.jsp">留言</a></li>
            </ul>
        </div>
    </div>
</nav>



</body>
</html>
