<head>
    <title>
        SignUp Page
    </title>
     <link rel="stylesheet" href="Stylesheets/SignUp_style.css">
     <link rel="stylesheet" href="Stylesheets/index_header_style.css">
     <link rel="stylesheet" href="Stylesheets/footer_style.css">
</head>
<body>
   <%@include file="index_header.jsp" %>
<!--   <div class="login_side">Already User? 
       <form action="login.jsp"><input id="button_login" type="submit" value="Login" ></form></div>-->
   <div class="box_one">
       <div class="text">
       <h3 id="text_one">Welcome to SELLLADA</h3>
       <p id="text_two">create a account to start selling
           <br><br><br>
       </p>
       </div>
       <form action="SellerSignup" method="post">
           <input id="field_one" type="text" placeholder="Enter your mobile number" name="mobileNo"><br>
           <input id="field_one" type="text" placeholder="Enter Seller Name" name="sellerName"><br>
           <input id="field_one" type="text" placeholder="Enter Company Name" name="compName"><br>
           <input id="field_one" type="text" placeholder="Enter Email" name="compEmail"><br>
           <input id="field_one" type="password" placeholder="Set Password" name="password"><br><br>
          <div class="text_one">
               <h4>
                   Make your Password  strong by adding :</h4><br>
          </div>
                <div class="text_one">
           <p>
               <br>
               Minimum * characters (letters & numbers)<br>
               Minimum 1 special character ( @ # $ % ^ & * )<br>
               Minimum 1 capital letter ( A-Z )<br>
                        Minimum 1 number (10-9)<br><br>
           </p>
           </div>
          
           <input id="field_two" type="submit" value="Sign Up" >
          
       </form>
   </div>
   <%@include file="footer.jsp" %>
</body>