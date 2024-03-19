<head>
    <title>
        Login Page
    </title>
     <link rel="stylesheet" href="Stylesheets/login_style.css">
     <link rel="stylesheet" href="Stylesheets/index_header_style.css">
     <link rel="stylesheet" href="Stylesheets/footer_style.css">
</head>
<body>
   <%@include file="index_header.jsp" %>
       
       <div class="box_one">
        <div class="text">
       <h3 id="text_one">Welcome to SELLADA</h3>
       <p id="text_two">Login to access your details.
           <br><br><br>
       </p>
       </div>
       
       <form action="SellerLogin" method="post">
           <input id="field_one" type="text" placeholder="Enter Email" name="compEmail"><br><br><br>
           <input id="field_one" type="password" placeholder="Set Password" name="password"><br><br><br><br>
           
           <input id="field_two" type="submit" value="Login" >
       </form>
       
       </div>
   
   <%@include file="footer.jsp" %>
</body>