<%@ page import="com.bugong.domain.BRole" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <title>
        View Books
    </title>
</head>
<body>
<table border=2>
    <tr>
        <th>Book ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>No. of copies AVAILABLE</th>
        <th>Number of favourites</th>
    </tr>

    <%
        ArrayList<BRole> dbooks=(ArrayList)request.getAttribute("bookslist");
        Iterator it=dbooks.iterator();
        while(it.hasNext())
        {
            BRole b=(BRole)it.next();
    %>
    <tr>
        <td><%=b.getId()%></td>
        <td><%=b.getRoleDescription()%></td>
        <td><%=b.getRoleName()%></td>
        <td><%=b.getRoleNo()%></td>
        <td><%=b.getRs1()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>