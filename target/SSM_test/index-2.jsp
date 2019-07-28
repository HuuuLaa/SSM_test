<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%----%>

<%--只适用于浏览器与服务器交互模型（client-server，Android和iOS处理起来很费劲--%>
<jsp:forward page="/emps"></jsp:forward>

<%--改造查询--%>

<%--服务器将有效的数据以JSON的形式返回给浏览器--%>
<%--index.jsp页面直接发送Ajax请求进行员工分页数据的查询
    服务器将查出的数据以json字符串的形式返回给浏览器
    浏览器收到js字符串，可以使用js对json进行解析，使用JS通过dom增删改改变页面信息
    返回json实现客户端的无关性--%>

<%--<html>--%>
<%--<head>--%>
    <%--<title>InsetTitle here</title>--%>
    <%--&lt;%&ndash;引入jQuery&ndash;%&gt;--%>
    <%--<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->--%>
    <%--<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/jquery-3.3.1.js"></script>--%>
    <%--&lt;%&ndash;引入样式&ndash;%&gt;--%>
    <%--<link href="static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">--%>
    <%--<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->--%>
    <%--<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>--%>
<%--</head>--%>
<%--<body>--%>
    <%--<h2>Hello World!</h2>--%>
    <%--<button class="btn btn-primary">按钮</button>--%>

    <%--<script type="text/javascript" src=""></script>--%>
<%--</body>--%>
<%--</html>--%>
