<%@ page import="com.bugong.domain.BArticle" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        View Books
    </title>
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>


    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js"></script>
</head>
<body>
<table border=2>


    <%
        ArrayList<BArticle> dbooks=(ArrayList)request.getAttribute("artList");
        Iterator it=dbooks.iterator();
        while(it.hasNext())
        {
            BArticle b=(BArticle)it.next();
    %>


    <div style="height: 100px;background: lightgrey" >
    <dt>
    <h4><a href="#"><%=b.getTitle()%></a></h4>
    <p><a href="#"><%=b.getContent()%></a></p>

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



    <%
        }
    %>
</table>
</body>
</html>