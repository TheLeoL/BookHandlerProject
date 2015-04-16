<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Init | Awesome book app</title>
    </head>
    <body>
        <h1> List the books </h1>
        <div>
            <form action="Init" method=POST>
                <input name="initbooks" type="submit" value="Initialize" />
            </form>

            <%@page import="java.util.List"%>
            <%@page import="model.Book"%>
            <%@page import="java.io.PrintWriter"%>
            <%
                if (request.getParameter("initbooks") != null) {
                    response.setContentType("text/html;charset=UTF-8");
                    
                    out.println("<p>");
                    out.println("Books initialized !");
                    out.println("</p>");
                }
            %>
        </div>
    </body>
</html>
