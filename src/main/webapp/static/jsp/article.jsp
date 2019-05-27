<%--
  Created by IntelliJ IDEA.
  User: Client01
  Date: 2019/3/11
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script src="bootstrap-table/dist/bootstrap-table.min.js"></script>
    <script src="bootstrap-table/dist/locale/bootstrap-table-zh-CN.min.js"></script>


</head>
<body>
<!--  < %@ include file="common/topIframe.jsp" %>
      < %@ include file="common/footIframe.jsp" %> -->

 <!-- 头文件 -->
 <jsp:include page="common/topIframe.jsp" flush="true" />

<div class="container-fluid"  style="background-image: url(/static/img/timg.jpg);background-size:contain;">

    <div class="row" style="margin-left:16%"  >
        <!-- padding移动div内文字  -->
        <div class="col-md-2"  style="padding-left:20px;background-color:#FCFCFC;">
            <h4>第一列</h4>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            </p>

            <hr>

            <dl>
                <dt>
                    <div>
                        <a href="">
                            <img src="/static/img/123.jpg" height="48px" width="48px" class="img-circle"  >
                        </a>
                        <span style="margin-bottom: 10px">swj</span>
                    </div>

                </dt>
                <hr>
                <dd>
                    <table frame="void" class="table"  id="">
                        <tr>
                            <th>
                                原创
                            </th>
                            <th>
                                粉丝
                            </th>
                            <th>
                                喜欢
                            </th>
                            <th>
                                评论
                            </th>
                        </tr>
                        <tr >
                            <td>
                                90

                            </td>
                            <td>
                                50
                            </td>
                            <td>
                                50
                            </td>
                            <td>
                                50
                            </td>
                        </tr>
                    </table>

                </dd>
                <hr>
                <dd>a</dd>
                <dt>b</dt>
                <dd>c</dd>
                <dd>
                    <table id="mytab" ></table>
                </dd>
            </dl>
        </div>

        <div class="col-md-8 "  style="padding-left:20px;background-color: #FCFCFC;margin-left: 20px">
            <h4>第二列</h4>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            </p>
            <hr>
            <dl>
                <div style="height: 60px">
                <dt>
                    <h4><a href="#">标题</a></h4>
                    <p><a href="#">摘要</a></p>
                    <div>
                        <p style="float: left">时间</p>
                        <p style="float: left">&nbsp;&nbsp;&nbsp;</p>
                        <p style="float: left">点击数</p>
                        <p style="float: left">&nbsp;&nbsp;&nbsp;</p>
                        <p style="float: left">评论数</p>
                    </div>
                </dt>
                </div>
                <hr>
                <div style="height: 60px">
                <dd>二级</dd>
                </div>
                <hr>
                <dd>二级</dd>
                <dt>一级</dt>
                <dd>二级</dd>
                <dd>二级</dd>
            </dl>

            <ul class="pagination">
                <li>
                    <a href="#">Prev</a>
                </li>
                <li>
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
                </li>
                <li>
                    <a href="#">Next</a>
                </li>
            </ul>
        </div>
    </div>

    <form action="/Article/Array" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input name="username" size="15"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input name="password" size="15"></td>
            </tr>
            <tr>
                <td><button type="submit">提交</button></td>
                <td><button type="reset">重置</button></td>
            </tr>
        </table>
    </form>
    <span>服务器信息：${info}</span>


</div>


 <!-- 尾文件 -->
 <jsp:include page="common/footIframe.jsp" flush="true" />

 <div>
 </div>

</body>

<script>
    $("#mytab").bootstrapTable('refresh', {url : url});





</script>
</html>
