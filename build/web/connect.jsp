<%-- 
    Document   : connect
    Created on : 16 avr. 2015, 18:30:46
    Author     : LeoL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connection</title>
    </head>
    <body>
        <h1>Connect to booksApp or register</h1>
        <%
            String logging = request.getParameter("login");
            String registering = request.getParameter("register");
            if(logging == null && registering == null){
         %>
        
        
        <h2> Connection </h2>
        <form id="loginForm" action="connect.jsp" method=POST>
            <label>Login : </label><input type="text" name="name"/>
            <label>Password : </label><input type="password" name="pass"/>
            <input type="hidden" name="login" value="true"/>
            <input type="submit" value="Login"/>
        </form>
        
        <h2> Register </h2>
        <form id="registerForm" action="connect.jsp" method=POST>
            <label>Login : </label><input type="text" name="name"/>
            <label>Password : </label><input type="password" name="pass"/>
            <input type="hidden" name="register" value="true"/>
            <input type="submit" value="Register"/>
        </form>
        
        <%
            }
            else{
                
                %>
                <p> Salut <%=request.getParameter("name")%> ! </p>
                <%
            }
                %>
    </body>
</html>
