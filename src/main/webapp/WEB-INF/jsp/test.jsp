<%@ page language="java" contentType="text/html; charset=UTF-8"

         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" charset="utf-8" content="width=device-width,
                                     initial-scale=1.0,
                                     maximum-scale=1.0,
                                     user-scalable=no">
	<title>Bootstrap 实例网页</title>
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
<div  class="img-responsive"   style="height:100px;margin-bottom:0; background-image: url(${pageContext.request.contextPath }/static/img/timg.jpg);background-size:cover" >
 <!-- 外层jpg图片  ../../timg.jpg       ../img/timg.jpg-->
<ul class="nav navbar-nav">
  <li><h1>allen的个人BLOG</h1></li>
  <li style="margin-left: 100px"><p>love life , love dream!</p></li>
</ul>
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
        <li><a href="../../static/jsp/bootstrap.jsp">留言</a></li>
      </ul>

      <ul class="nav navbar-nav" style="float: right;margin-right: 100px" >
      <li class="active"><a href="#">账户名</a></li>
      <li class="active"><a href="#">登陆</a></li>
      <li class="active"><a href="#">注册</a></li>
      </ul>
    </div>

  </div>
</nav>

<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h2>关于我</h2>
      <h5>我的照片:</h5>
      <div class="fakeimg">这边插入图像


      </div>
      <p>关于我的介绍..</p>
      <h3>链接</h3>
      <p>描述文本。</p>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#">链接 1</a></li>
        <li><a href="#">链接 2</a></li>
        <li><a href="#">链接 3</a></li>
      </ul>
      <hr class="hidden-sm hidden-md hidden-lg">
    </div>
    <div class="col-sm-8">
      <h2>标题</h2>
      <h5>副标题</h5>
      <div class="fakeimg">图像</div>
      <p>一些文本..</p>
      <p>菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！</p>
      <br>
      <h2>标题</h2>
      <h5>副标题</h5>
      <div class="fakeimg">图像</div>
      <p>一些文本..</p>
      <p>菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！</p>
    </div>
  </div>
</div>

<div class="jumbotron text-center" style="margin-bottom:0">
  <p>底部内容</p>
</div>
</body>
</html>