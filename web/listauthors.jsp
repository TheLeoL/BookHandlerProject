<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Authors | Awesome book app</title>
    </head>
    <body>
        <h1> List the authors </h1>
        <div>
            <form action="ListAuthors" method=POST>
                <input name="listauthors" type="submit" value="List" />
            </form>

            <%@page import="java.util.List"%>
            <%@page import="java.io.PrintWriter"%>
            <%
                if (request.getParameter("listauthors") != null) {
                    response.setContentType("text/html;charset=UTF-8");
                    List<String> list = (List<String>) request.getAttribute("result");
                   
                    out.println("<p>");
                    for (String a : list) {
                        out.println(a + "<br />");
                    }
                    out.println("</p>");
                }
            %>
        </div>
    </body>
</html>
