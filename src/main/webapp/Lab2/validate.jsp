
<%@ page import="com.LiuFangbao.Lab2.Login" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/15/2021
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
    <%--Todo 1: Use <jsp:useBean> to create a Login bean instance in request scope --%>
    <jsp:useBean id="user" class="com.LiuFangbao.Lab2.Login" scope="request"/>
    <%--Todo 2: Use <jsp:setProperty> to set  beans' property username and password--%>
    <jsp:setProperty name="user" property="username" value='<%=request.getParameter("username")%>'/>
    <jsp:setProperty name="user" property="password" value='<%=request.getParameter("password")%>'/>
    <%
        //todo 3: use if check username is admin and password is admin
        if ((user.getUsername()).equals("admin") && (user.getPassword()).equals("admin")){
            session.setAttribute("user", user);
    %>

    <%--todo 4: use jsp:forward to welcome.jsp page--%>
    <jsp:forward page="welcome.jsp"/>
    <%--todo 5: else part{ --%>
    <%
    }else {
    // todo 6: print username or password error message
        out.println("Username Password Error");
    %>
    <%--todo 7: use jsp:include login.jsp page --%>
    <jsp:include page="login.jsp"/>
    <%--todo 8: close else --%>
    <%
        }
    %>
</body>
</html>