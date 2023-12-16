<%-- 
    Document   : sales
    Created on : Dec 12, 2023, 10:18:11 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="userData" scope="session" class="com.InfoBean.UserData" />
<jsp:setProperty name="userData" property="*" />
<%@page import="java.util.*, java.text.*" %>
<%
    DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
    String sd = df.format(new Date());
    %>
    <h4>Today: <%=sd%></h4>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Selamat Datang, <%=userData.getNamaUser()%></h2>
        ID ANDA = <jsp:getProperty name="userData" property="idUser" /><br>
        USIA ANDA = <jsp:getProperty name="userData" property="umur" /><br>
        <p> </p>
        <a href="index.jsp" >LOGIN</a>
    </body>
</html>
