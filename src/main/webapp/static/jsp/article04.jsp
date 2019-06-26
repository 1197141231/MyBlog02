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
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>


    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js"></script>


</head>
<body>
<!--  < %@ include file="common/topIframe.jsp" %>
      < %@ include file="common/footIframe.jsp" %> -->


<!-- 头文件 < jsp:include page="common/topIframe.jsp" flush="true" />  -->

<%@include file = "common/topIframe.jsp" %>
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
                                <p id="articleCount"></p>
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
                <dd></dd>
                <dt>b</dt>
                <dd>c</dd>
                <dd>

                </dd>
            </dl>
        </div>

        <div class="col-md-8 "  style="padding-left:20px;background-color: #FCFCFC;margin-left: 20px;">
            <h4>第二列</h4>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            </p>

            <table id="mytab"  >

            </table>

            <div  id="page" align="center" >

            </div>


        </div>

    </div>





</div>
<!-- 尾文件
 < %@ include file = frangmentURL%> 静态的
< jsp:include page= frangmentURL />动态的
 < jsp:include page="common/footIframe.jsp" flush="true" />

引入top foot 后报错，先引用了bootstrap,修改头尾文件删除bootstrap引用或jquery引用，暂未找到其他方法


-->


<%@include file = "common/footIframe.jsp" %>
 <div>
 </div>

</body>

<script>

    var limit = 10;//单页显示数.默认5
    var offset = 0;//起始索引，初始0
    var page = 1;//页码，初始1
    var param = {"limit":limit,"offset":offset,"page":page};


    //页面初始化加载
    $(document).ready(function() {
        flushList();  //刷新列表
        flushPage();  //刷新页码
    });

    //限制字数
    function formatLimit(value) {
        if(value.length > 80){
            var str = value.substring(0,80) + "...";
            return str ;
            // alert(str);
        }else{
            return value ;
        }

    }

    //点击页码按钮
    function work(target) {
        //清空原先的html,不清空原先的查询结果也在
       $("#mytab").empty();
        page = $(target).text();
        offset = (page-1) * limit ;
        param = {"limit":limit,"offset":offset,"page":page};
        flushList();
    }

    //刷新表数据
    function flushList() {
        $.ajax({
            type: "post",
            data: JSON.stringify(param),
            datatype: 'json',
            contentType : 'application/json;charset=UTF-8',
            url: "/Page/tableExampleServer",
            success: function (response) {
                var objs = eval(response);
              //  var objs = response;
                var tbody = "";
                for (var j = 0; j < objs.rows.length; j++) {
                    var trs = "";
                    trs += "<div style=\"height: 100px;background: lightgrey\" >" +
                        "<dt>\n" +
                        "<h4><a href=\"#\">"+formatLimit(objs.rows[j].title)+"</a></h4>" +
                        "<p><a href=\"#\">"+formatLimit(objs.rows[j].content)+"</a></p>" +
                        "<div>" +
                        "<p style=\"float: left\">时间</p>" +
                        "<p style=\"float: left\">&nbsp;&nbsp;&nbsp;</p>" +
                        "<p style=\"float: left\">点击数</p>" +
                        "<p style=\"float: left\">&nbsp;&nbsp;&nbsp;</p>" +
                        "<p style=\"float: left\">评论数</p>" +
                        "</div>" +
                        "</dt>" +
                        " </div>" +
                        "<hr>"
                    ;
                    tbody += trs;
                }
                //表格数据
                $("#mytab").append(tbody);

            },
            error: function (e) {
                alert('Failed!: ' + e);
            }

        });
    }

    //刷新页码
    function  flushPage(){
        $.ajax({
            type: "post",
            data: JSON.stringify(param),
            datatype: 'json',
            contentType : 'application/json;charset=UTF-8',
            url: "/Page/tableExampleServer",
            success: function (response) {
                var objs = eval(response);
                var pbody = "";
                //分页数，总数/每页5 ,Math.ceil向上取整
                var pageCount = Math.ceil(objs.total/limit);
                var uls = "";

                for (var i = 1; i <pageCount+1; i++) {
                    uls += "<li><a href=\"#\" onclick='work(this)' >"+i+"</a></li>";
                }
                pbody = "<ul  class=\"pagination pagination-sm\">\n" +
                    "                    <li><a href=\"#\" onclick='pageSy()'>&laquo;</a></li>\n" +
                    uls +
                    "                    <li><a href=\"#\" onclick='pageXy()'>&raquo;</a></li>\n" +
                    "                </ul>";
                $("#page").append(pbody);
                //用户下文章数
                $("#articleCount").append(objs.total);
            },
            error: function (e) {
                alert('Failed!: ' + e);
            }
        });
    }

    //上一页
    function pageSy(){

        //改变当前页
        if(page>1)
        {
            //如果不是第一页
            page = parseInt(page) - 1;
            $("#mytab").empty();

            offset = (page-1) * limit ;
            param = {"limit":limit,"offset":offset,"page":page};
            flushList();
        }


    }

    //下一页
    function pageXy(){
        //改变当前页

        if(page <=  Math.ceil($("#articleCount").text()/limit))
        {
            page = parseInt(page) + 1;
            $("#mytab").empty();

            offset = (page-1) * limit ;
            param = {"limit":limit,"offset":offset,"page":page};
            flushList();
        }

    }

</script>

<style type="text/css">

    #mytab{
        width: 100%;
        table-layout: fixed;
        border: 2px;
    }

</style>


</html>
