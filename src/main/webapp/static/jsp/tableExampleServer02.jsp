<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Demo</title>


    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>

    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js"></script>


<body>
    <div class="panel panel-default">


</div>
<table id="mytab" class="table table-hover">


</table>
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

     //   contentType: "application/x-www-form-urlencoded; charset=UTF-8",
        queryParams: function queryParams(params) {//上传服务器的参数
            var temp = {//如果是在服务器端实现分页，limit、offset这两个参数是必须的
                limit: params.limit, // 每页显示数量
                offset: params.offset, // SQL语句起始索引
                page : (params.offset / params.limit) + 1, //当前页码

                title: $('#search_title').val(),
                content: $('#search_content').val()
            };
            return temp;
        },
        columns: [{
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

    .table{
        width: 100%;
        height: 50%;
        table-layout: fixed;
        border: 2px;
    }
</style>