<!--<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="Stylesheets/header_style.css">
</head>-->
<%@page import="sellada.util.SellerDetails" %>
<% SellerDetails seller=new SellerDetails();%>

<div class="box">
    <!--<span id="icon_one"> <i  class="fa-solid fa-circle-arrow-left"  style="color: #a816c0;"></i></span>-->
    <a href="yourProducts.jsp"><span id="icon_two"><i  class="fa-sharp fa-solid fa-house" style="color: #a816c0;"></i></span></a>
    <input id="text_field" type="text" placeholder="Look for order by ID or product name" />
    <span id="sellerName">Welcome,<strong><%= SellerDetails.getSellerName() %></strong></span>
    <span id="icon_three"><i class="fa-solid fa-user" style="color: #a816c0;" ></i></span>
</div>