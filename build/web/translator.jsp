<!DOCTYPE html>
<html lang="en-US">
<head>
    <title>SELLADA</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="Stylesheets/header_style.css">
    <link rel="stylesheet" href="Stylesheets/footer_style.css">
    <link rel="stylesheet" href="Stylesheets/translator_style.css">
</head>

<body>
    <%@include file="header.jsp" %>
 <div id="google_translate_element">

<script type="text/javascript">
function googleTranslateElementInit() {
  new google.translate.TranslateElement({pageLanguage: 'en'}, 'google_translate_element');
}
</script>

<script type="text/javascript" src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
</div> 
    <div class="main">

        <p id="left"><br>Hello, My name is Swadesh<br>
            And i want to do business with you</p>
        <br>
<p id="right"><br>Hello,Swadesh</p>

    </div>

 <%@include file="footer.jsp" %>

</body>
</html>