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
</head>

<body>
<!--查询窗体-->
<div class="widget-content">
    <form method="post" class="form-horizontal" id="eventqueryform">
        <input type="text" class="span2" name="seqNo" placeholder="编号">
        <input type="text" class="span3" name="name" placeholder="姓名">
        <input type="button" class="btn btn-default span1" id="eventquery" value="查询">
    </form>
</div>

<div class="widget-content">
    <!--工具条-->
    <div id="toolbar">
        <button class="btn btn-success btn-xs" data-toggle="modal" data-target="#add">添加事件</button>
    </div>
    <table id="eventTable"></table>
</div>
</body>




<script>
    //$(document).ready(function(){
    $(function() {
        // 初始化表格
        initTable();

        // 搜索按钮触发事件
        $("#eventquery").click(function() {
            $('#eventTable').bootstrapTable(('refresh')); // 很重要的一步，刷新url！
            // console.log("/program/area/findbyItem?offset="+0+"&"+$("#areaform").serialize())
            $('#eventqueryform input[name=\'name\']').val('')
            $('#eventqueryform input[name=\'seqNo\']').val('')
        });

    });

    // 表格初始化
    function initTable() {
        $('#eventTable').bootstrapTable({
            method : 'post',  // 向服务器请求方式
            contentType : "application/x-www-form-urlencoded", // 如果是post必须定义
            url : '/Page/abc',  // 请求url
            cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            striped : true, // 隔行变色
            dataType : "json", // 数据类型
            pagination : true, // 是否启用分页
            showPaginationSwitch : false, // 是否显示 数据条数选择框
            pageSize : 10, // 每页的记录行数（*）
            pageNumber : 1,   // table初始化时显示的页数
            pageList: [5, 10, 15, 20], //可供选择的每页的行数（*）
            search : false, // 不显示 搜索框
            sidePagination : 'server', // 服务端分页
            classes : 'table table-bordered', // Class样式
//   showRefresh : true, // 显示刷新按钮
            silent : true, // 必须设置刷新事件
            toolbar : '#toolbar',    // 工具栏ID
            toolbarAlign : 'right',   // 工具栏对齐方式
      //      queryParams : queryParams, // 请求参数，这个关系到后续用到的异步刷新
            columns : [ {
                field : 'title',
                title : '编号',
                align : 'center'
            }, {
                field : 'content',
                title : '姓名',
                align : 'center'
            }],
        });
    }

    // 分页查询参数，是以键值对的形式设置的
    function queryParams(params) {
        return {
            name : $('#eventqueryform input[name=\'name\']').val(),  // 请求时向服务端传递的参数
            seqNo : $('#eventqueryform input[name=\'seqNo\']').val(),

            limit : params.limit, // 每页显示数量
            offset : params.offset, // SQL语句偏移量
        }
    }


</script>

</html>