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
                <dd>a</dd>
                <dt>b</dt>
                <dd>c</dd>
                <dd>

                </dd>
            </dl>
        </div>

        <div class="col-md-8 "  style="padding-left:20px;background-color: #FCFCFC;margin-left: 20px">
            <h4>第二列</h4>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
            </p>

            <table id="mytab" border="5px" ></table>

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
    $('#mytab').bootstrapTable({

        method: 'post',
        url: "/Page/tableExampleServer",//请求路径
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'server',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10, 20, 30],//可选择单页记录数
        showRefresh: false,//刷新按钮
        //height: 250,
        //   contentType: "application/x-www-form-urlencoded; charset=UTF-8",
        queryParams: function queryParams(params) {//上传服务器的参数
            var temp = {//如果是在服务器端实现分页，limit、offset这两个参数是必须的
                limit: params.limit, // 每页显示数量
                offset: params.offset, // SQL语句起始索引
                page : (params.offset / params.limit) + 1, //当前页码

                title: $('#search_title').val(),
                content: $('#search_content').val()
            };
            $("#articleCount").append(temp.limit);

            return temp;

        },
        columns: [

            {
            title: '标题',
            field: 'title',
            sortable: true,

            width: '10%',

        }, {
            title: 'id',
            field: 'id',
            width: '10%',

        } ,{
            title: '内容',
            field: 'content',
            sortable: true,

            width: '80%',
            formatter: formatLimit//对返回的数据进行处理再显示
        }]
    })




    //限制字数
    function formatLimit(value, row, index) {
        if(value.length > 100){
            var str = value.substring(0,100) + "...";
            return str ;
            // alert(str);
        }else{
            return value ;
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
