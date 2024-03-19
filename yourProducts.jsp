<%@page import="sellada.util.ProductDetails,java.util.List" %>
<head>
    <title>Your Products</title>
    <link rel="stylesheet" href="Stylesheets/header_style.css">
    <link rel="stylesheet" href="Stylesheets/footer_style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="Stylesheets/sidebar_style.css">
    <link rel="stylesheet" href="Stylesheets/yourProducts_style.css">
</head>
<%

    List<ProductDetails> products = (List<ProductDetails>) application.getAttribute("productList");
%>
<body>
    <%@include file="header.jsp" %>
    <%@include file="sidebar.jsp" %>
    <div class="container">
        <%
            int count = 0;
            for (ProductDetails product : products) {
                if (count == 4) {
                    out.print("");
                    count=0;
                }
                out.println("<div class='container_in'>");
                out.println("<img id='productImg' src='media/productImages/" + product.getProductImg() + "'><br>");
                out.println("<span id='productName'>" + product.getProductName() + "</span><br>");
                out.println("<span id='productPrice'>" + product.getProductPrice() + "/-Rs.</span><br>");
                out.println("<span id='productDesc'>" + product.getProductDesc() + "</span><br>");
                out.println("</div>");
                count++;
            }
        %>
    </div>
    <div id="icon">
     <a id="chatIcon" href="translator.jsp"><i class="fa-solid fa-comment" style="color: #d94bec;"></i></a>
</div><br><br><br><br>
    <%@include file="footer.jsp" %>
</body>