<!DOCTYPE html>

<html>
    <head>
        <title>Add | Awesome book app</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <%
                String title = "", author = "", year = "2015", price = "5";

                String add = request.getParameter("addabook");
                if (add != null) {

                    title = request.getParameter("title");
                    if (title == null) {
                        title = "";
                    }

                    author = request.getParameter("author");
                    if (author == null) {
                        author = "";
                    }

                    year = request.getParameter("year");
                    if (year == null) {
                        year = "2015";
                    }

                    price = request.getParameter("price");
                    if (price == null) {
                        price = "5";
                    }

                }

                session.setAttribute("s_title", title);
                session.setAttribute("s_author", author);
                session.setAttribute("s_year", year);
                session.setAttribute("s_price", price);
            %>

            <form id="bookForm" action="bookform.jsp" method=POST>
                <p>
                    <label for="title">Title : </label>
                    <input id="title" name="title" type="text" value="<%= session.getAttribute("s_title")%>" required=REQUIRED />
                </p>
                <p>
                    <label for="author">Author : </label>
                    <input id="author" name="author" type="text" value="<%= session.getAttribute("s_author")%>" required=REQUIRED />
                </p>
                <p>
                    <label for="year">Publish year : </label>
                    <input id="year" name="year" type="number" value="<%= session.getAttribute("s_year")%>" required="REQUIRED"/>
                </p>
                <p>
                    <label for="price">Price : </label>
                    <input id="price" name="price" type="number" step="0.01" min="0" value="<%= session.getAttribute("s_price")%>" required="REQUIRED"/>
                </p>
                <p>
                    <input name="addabook" type="submit" value="Add this book"/>
                </p>
            </form>

            <%@page import="model.Book"%>
            <%
                if (add != null) {
                    Book newBook = new Book(title, author, Short.parseShort(year), Float.parseFloat(price));
                    out.print("<p>");
                    out.print(newBook);
                    out.print("</p>");
                }
            %>
        </div>
    </body>
</html>
