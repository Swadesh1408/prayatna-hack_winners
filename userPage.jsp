<head>
    <title>User Page</title>
    <link rel="stylesheet" href="Stylesheets/userPage-style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="Stylesheets/header_style.css">
    <link rel="stylesheet" href="Stylesheets/footer_style.css">
     <link rel="stylesheet" href="Stylesheets/sidebar_style.css">
    
</head>
<body>
    <%@include file="header.jsp" %>
     <%@include file="sidebar.jsp" %>
    <div class="userPage">
        <div class="card">
            <img class="card" src="media/image/emptybox.png">
        </div>

        <div class="products">No Products Available!</div>   

        <div ><a id="anchor" href="AddProduct.jsp">Click here to Add Your Product</a></div>
    </div>
    <br><br><br><br>
    <div id="icon">
        <a id="chatIcon" href="translator.jsp"><i class="fa-solid fa-comment" style="color: #d94bec;"></i></a>
</div><br><br><br><br>
    <%@include file="footer.jsp" %>
    
</body>
