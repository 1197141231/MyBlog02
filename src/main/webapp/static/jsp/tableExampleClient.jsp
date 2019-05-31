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
    <div class="panel-heading">
        查询条件
    </div>
    <div class="panel-body form-group" style="margin-bottom:0px;">
        <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">标题：</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name="Name" id="search_title"/>
        </div>
        <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">内容：</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name="Name" id="search_content"/>
        </div>
        <div class="col-sm-1 col-sm-offset-4">
            <button class="btn btn-primary" id="search_btn">查询</button>
        </div>
    </div>
</div>
<table id="mytab" class="table table-hover"></table>
</body>


<script>
    $('#mytab').bootstrapTable({
        method: 'post',
        url: "/Page/tableExampleClient",//请求路径
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 4,//单页记录数
        pageList: [5, 10, 20, 30],//可选择单页记录数
        search: true, //显示搜索框
        showRefresh: true,//刷新按钮

        queryParams: function (params) {//上传服务器的参数
            var temp = {//如果是在服务器端实现分页，limit、offset这两个参数是必须的
 //               limit: params.limit, // 每页显示数量
 //               offset: params.offset, // SQL语句起始索引
//page : (params.offset / params.limit) + 1, //当前页码

                title: $('#search_title').val(),
                content: $('#search_content').val()

            };
            return temp;
        },
        columns: [{
            title: '登录名',
            field: 'title',
            sortable: true
        }, {
            title: '姓名',
            field: 'content',
            sortable: true
        }, {
            title: '手机号',
            field: 'id',
        }, {
            title: '性别',
            field: 'type',
            formatter: formatSex,//对返回的数据进行处理再显示
        }, {
            title: '操作',
            field: 'article_no',
            formatter: operation,//对资源进行操作
        }]
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
        });
    })




</script>