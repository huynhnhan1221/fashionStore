<%-- 
    Document   : index
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        
        <link rel="stylesheet" href="css/nivo-slider.css" type="text/css">
        <link rel="stylesheet" href="css/themes/default/default.css" type="text/css">
        <link rel="stylesheet" href="css/cloudzoom.css" type="text/css">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
        
                <script type="text/javascript" src="js/jquery.carouFredSel-6.2.1-packed.js"></script>
                <script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#foo1').carouFredSel({
					auto: {
						pauseOnHover: 'resume',
						progress: '#timer1'
					}
				}, {
					transition: true
				});
	});
		
	</script>
        
        <script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider({
        effect: 'random',
        slices: 15,
        boxCols: 8,
        boxRows: 4,
        animSpeed: 600,
        pauseTime: 3000,
        startSlide: 0,
        directionNav: true,
        controlNav: false,
        controlNavThumbs: false,
        pauseOnHover: true,
        manualAdvance: false,
        prevText: 'Prev',
        nextText: 'Next',
        randomStart: false
        });
    });
    </script>
    </style>
	
<style >
#top{
		width:50px;
		height:50px;
		position:fixed;/*giu co dinh*/
		text-indent:-9999px;
		cursor:pointer;/*tao bieu tuong cho biet co the tac dong*/
		background: url(images/icon/top.png) no-repeat 0 0;
		bottom:10px; right:10px;
	}
        </style>

<script>
	$(document).ready(function(){
		$('#main').append('<div id="top" title="Trở về đầu trang">back to top</div>');
		$(window).scroll(function(){
			if($(window).scrollTop() !==0){
				$('#top').fadeIn();
			}
			else $('#top').fadeOut();
		});
		$('#top').click(function(){
			$('html, body').animate({scrollTop:0},500);
		});
	});
</script>
    <style type="text/css">
		.slider-wrapper{
			margin:0px auto;
			width: 600px;height: 200px;
		}
	</style>
    
    </head>
    <body>
        
        <div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&appId=266459763505486&version=v2.0";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>

        <div align="center" id="main">
            <div align="center" id="container">
            <%@include file="includes/top_menu.jsp" %>
            <div id="wrapper">
                <div class="left-content">
                <%@include file="includes/sidebar_left.jsp" %>

                <!--thuc don hm nay-->
                <%@include file="includes/menu_today.jsp" %>
                <!--end thuc don hom nay-->
                <div align="center" class="content">
                    <div class="slideshow">
                       
                          <div class="slider-wrapper theme-default">
            <div id="slider" class="nivoSlider">
                <img src="images/banner2.jpg" data-thumb="images/banner2.jpg" alt="" width="570" height="200"/>
                <a href="#"><img src="images/banner3.png" data-thumb="images/banner3.png" alt="" title=" Thời trang Hàn Quốc" width="570" height="200"/></a>
                <img src="images/banner4.jpg" data-thumb="" alt="" data-transition="slideInLeft" title=" Phong cách sống thời thượng" width="570" height="200"/>
                <img src="images/banner_chinh.png" data-thumb="images/banner_chinh.png" alt="" title="#htmlcaption" width="570" height="200"/>
            </div>
            <div id="htmlcaption" class="nivo-html-caption">
                
            </div>
        </div>
                        
                    
                             
                       
                        
                    </div>
                </div>
                <div class="right-content">
                    <div class="right-content-box">
                        <%@include file="includes/search_box.jsp" %>
                    
                    
                       
                </div>
                
            </div>
                        

                 
            <%@include file="includes/footer.jsp" %>
