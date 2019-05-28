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
                <dd>


                </dd>
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


            <table id="mytab" border="5px" ></table>









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

    <div id="result" style="font-size:16px;color:red;"></div >
    <table class="tables" id="project" border="2px">
        <tr >
        <tr>
            <td class="table_tit">用户名</td>
            <td class="table_tit">密码</td>

    </table >

</div>


 <!-- 尾文件 -->
 <jsp:include page="common/footIframe.jsp" flush="true" />

 <div>
 </div>

</body>

<script>







    //页面加载文章信息
    $(document).ready(function(){

        $.ajax({
            type:"GET",
            url:"/Article/news",
            success:function(response){
             //   alert("***"+response)



              //  var json =[{"name":"项海军","password":"123456"}];

                 $("#result ").html("遍历");

              //   $.each(response,function(n,value) {
              //       alert(n+' '+value);
              //       var trs = "";
              //       alert("**"+value.content)
              //       trs += " <tr><td> " +value.name+" </td><td>" + value.password +"</td></tr>";
              //       tbody += trs;
              //   });
              //   $("#project").append(tbody);

                //解析后台传过来的json
                var objs = eval(response);
                var tbody = "";
                for(var j = 0;j<objs.length;j++){
                    // alert(objs[j].content);
                    // alert(objs[j].id);
                    var trs = "";
                    trs += "<tr><td class='table_tit'>" +objs[j].content+"</td><td class='table_tit'>" + objs[j].id +"</td></tr>";
                    tbody += trs;

                //    alert("@@@"+tbody);
                }
                $("#project").append(tbody);

                //用户下文章数
                $("#articleCount").append(objs.length);

            },
            error : function(e) {
                alert('Failed!: ' + e);
            }
        });
    });




    $('#mytab').bootstrapTable({
        method : 'get',
        url : "/Page/getUserListPage",//请求路径
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'server',//server:服务器端分页|client：前端分页
        pageSize : 4,//单页记录数
        pageList : [ 5, 10, 20, 30 ],//可选择单页记录数
        showRefresh : true,//刷新按钮
        queryParams : function(params) {//上传服务器的参数
            var temp = {//如果是在服务器端实现分页，limit、offset这两个参数是必须的
                limit : params.limit, // 每页显示数量
                offset : params.offset, // SQL语句起始索引
                page : (params.offset / params.limit) + 1, //当前页码

                Name : $('#search_name').val(),
                Tel : $('#search_tel').val()
            };
            return temp;
        },
        columns : [ {
            title : '登录名',
            field : 'loginName',
            sortable : true
        }, {
            title : '姓名',
            field : 'name',
            sortable : true
        }, {
            title : '手机号',
            field : 'tel',
        }, {
            title : '性别',
            field : 'sex',
            formatter : formatSex,//对返回的数据进行处理再显示
        }, {
            title : '操作',
            field : 'id',
            formatter : operation,//对资源进行操作
        } ]
    })

    //value代表该列的值，row代表当前对象
    function formatSex(value, row, index) {
        return value == 1 ? "男" : "女";
        //或者 return row.sex == 1 ? "男" : "女";
    }

    //删除、编辑操作
    function operation(value, row, index) {
        var htm = "<button>删除</button><button>修改</button>"
        return htm;
    }

    //查询按钮事件
    $('#search_btn').click(function() {
        $('#mytab').bootstrapTable('refresh', {
            url : 'user/getUserListPage'
        });
    })







</script>

<style type="text/css">

.tables{
width: 100%;
height: 10%;
table-layout: fixed;
border: 2px;
}
.table_tit{
white-space: nowrap;    /*  禁止td换行 */
overflow: hidden;        /* 隐藏X,Y滚动条 */
text-overflow: ellipsis;}   /*将显示不完的以显示*/

</style>

</html>
