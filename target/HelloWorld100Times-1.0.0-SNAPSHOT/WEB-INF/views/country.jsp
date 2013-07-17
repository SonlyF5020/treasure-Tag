<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.css" rel="stylesheet">
    <title>Home</title>
        <script type="text/javascript">
        $(document).ready(function() {
            $('.tagTitle').mouseover(function(){
            $(this).addClass('over');
            })
            .mouseout(function(){
            $('.tagTitle').removeClass('over');
            })
            .click(function() {
                $('.tagTitle').removeClass('clicked');
                $(this).addClass('clicked');
                $('.tagContent').hide();
                var divID = $(this).attr("id").replace("Title","Content")
                $('#'+divID).show();
            });
        });
        </script>
</head>
<body class="body">
<h1 class="textCenter">Oh, you find ${treasure}</h1>
        <div class="tags">
            <div id="titles" class="titles">
                <div id="tagTitle_1" class="tagTitle">News</div>
                <div id="tagTitle_2" class="tagTitle">Sports</div>
                <div id="tagTitle_3" class="tagTitle">Games</div>
             </div>

             <div id="contents" class="contents">

                <div id="tagContent_1" class="tagContent">
                <h2>China NEWS</h2>
                <hr>
                <span>China is going to attack Japan with aircraft</span>
                </div>

                <div id="tagContent_2" class="tagContent">
                <h2><bold>David Beckham<bold> Leave Real Mardrid!</h2>
                <hr>
                <p>Because of the unsatisfied salary, david chose to leave RM,
                where is the next staion?</p>
                    </div>

                <div id="tagContent_3" class="tagContent">
                <h2>Bllizard is going to release the newest RTS game: Warcraft 3!</h2>
                <hr>
                <p>After 10 years waiting ,Warcraft 3 is comming soon!</p>
                    </div>
             </div>
        </div>
    <div class="bottomButton">
        <a href="/home" class="btn">continue</a>
        </div>
</body>
</html>
