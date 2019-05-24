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
                    <table frame="void" class="table"   >
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
                <dd>二级</dd>
                <dt>一级</dt>
                <dd>二级</dd>
                <dd>二级</dd>
            </dl>
        </div>

        <div class="col-md-8 "  style="padding-left:20px;background-color: #FCFCFC;margin-left: 20px">
            <h4>第二列</h4>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            </p>
            <dl>
                <dt>一级</dt>
                <dd>二级</dd>
                <dd>二级</dd>
                <dt>一级</dt>
                <dd>二级</dd>
                <dd>二级</dd>
            </dl>

        </div>
    </div>



</div>


 <!-- 尾文件 -->
 <jsp:include page="common/footIframe.jsp" flush="true" />

 <div>
 </div>

</body>
</html>
