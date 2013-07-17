<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <title>Home</title>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
    <link href="<%=request.getContextPath()%>/resources/css/myStyle.css" rel="stylesheet">
</head>
<body>
<h2 class="textCenter">Chose one country to find your treasure:</h2>

<div class="center">
<a href="/country/china" class="btn" value="china">China</a>
<a href="/country/american" class="btn" value="american">American</a>
<a href="/country/india" class="btn" value="india">India</a>
<a href="/country/canada" class="btn" value="canada">Canada</a></div>

</body>
</html>
