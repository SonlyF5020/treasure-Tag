<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<html lang="en">
<head><title><decorator:title default="decorator..."/></title>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/myStyle.css" rel="stylesheet">
<decorator:head/>  </head>
<body class="bodyBackground">
<div >
    <h1 class="textCenter"><img src="/resources/img/onion.jpg" class="imgSize"> Treasure Game</h1>
    <hr>
    <decorator:body/>
    <hr>
    <div>
        <p>&copy; Iron Man</p>
    </div>
</div>
</body>
</html>