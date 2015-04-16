<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List | Awesome book app</title>
    </head>
    <body>
        <h1> List the books </h1>
        <div>
            <form action="List" method=POST>
                <input name="listbooks" type="submit" value="List" />
            </form>

            <%@page import="java.util.List"%>
            <%@page import="model.Book"%>
            <%@page import="java.io.PrintWriter"%>
            <%
                if (request.getParameter("listbooks") != null) {
                    response.setContentType("text/html;charset=UTF-8");
                    List<Book> list = (List<Book>) request.getAttribute("result");
                   
                    out.println("<p>");
                    for (Book b : list) {
                        out.println(b + "<br />");
                    }
                    out.println("</p>");
                }
            %>
        </div>
    </body>
</html>
