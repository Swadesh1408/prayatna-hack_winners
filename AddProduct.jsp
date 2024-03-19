<head>
    <title>Add Product Page</title>
    <link rel="stylesheet" href="Stylesheets/addProduct_style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="Stylesheets/header_style.css">
    <link rel="stylesheet" href="Stylesheets/footer_style.css">
    <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">-->
<link rel="stylesheet" href="Stylesheets/sidebar_style.css">
</head>
<body>
    <%@include file="header.jsp" %>
     <%@include file="sidebar.jsp" %>
    <div class="product_add">
    <form action="SellerProductAdding" method="post" enctype="multipart/form-data">
        <div class="field_one_one">
        <span id="name">Product name :</span>
        <input id="text_field_one" type="text" name="prodName" placeholder="Enter Product name" ><br>
        </div>
        
        <div class="field_one_one">
            <span id="name">Product Description : </span>
        <textarea  type="text" name="prodDesc" placeholder="Enter the  description of your products" rows="5" cols="60" ></textarea><br>
        </div>
        
        <div class="field_one_one">  
            <span id="name">Select Image :</span>
        <input  type="file" name="prodImg"  /><br>
        </div>
        
        <div class="field_one_one">
            <span id="name">Dimensions :</span>
        <input id="text_field_three" name="prodDimen" type="text" placeholder="XX x YY x ZZ"  ><br>
        <p><br>Please Enter dimensions in the format provided :[XX x YY x ZZ]</p>
        </div>
        
        <div  class="field_one_one">
            <span id="name"> Weight :</span>
         <input id="text_field_four" name="prodWeight" type="text" placeholder="in KG" ><br>
        </div>
        
        <div  class="field_one_one">
            <span id="name">Price :</span>
            <input id="text_field_five" name="prodPrice" type="text" placeholder="INR" ><br><br>
        <span id="name">Available stock :</span>
        <input id="text_field_eight" name="availQty" type="text" placeholder="quantity" ><br>
        </div>
        
        <div class="field_one_one">
            <span id="name">Age Group :</span>
         <input id="text_field_six" name="ageGroup" type="text" placeholder="quantity" ><br>
        </div>
        
        <div  class="field_one_one">
            <span id="name">Country of Origin :</span>
         <input id="text_field_seven" name="prodCOO" type="text" placeholder="quantity" ><br>
        </div>
        
         <input id="field_one_two" type="submit" value="Upload">
           
    </form>
    </div>
    <%@include file="footer.jsp" %>
</body>