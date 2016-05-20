<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
 <!DOCTYPE html>
<!--[if IE 8]>      <html class="ie ie8"> <![endif]-->
<!--[if IE 9]>      <html class="ie ie9"> <![endif]-->
<!--[if gt IE 9]><!-->  <html> <!--<![endif]-->
  <head>
    <meta charset="utf-8" />
    <title>Photon</title>
    <meta name="keywords" content="HTML5,CSS3,Template" />
    <meta name="description" content="" />
    <meta name="Author" content="Dorin Grigoras [www.stepofweb.com]" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />

    <!-- mobile settings -->
    <meta name="viewport" content="width=device-width, maximum-scale=1, initial-scale=1, user-scalable=0" />

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/images/demo/favicon.ico" />

    <!-- WEB FONTS -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800&amp;subset=latin,latin-ext" rel="stylesheet" type="text/css" />

    <!-- CORE CSS -->
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/font-awesome.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/sky-forms.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/weather-icons.min.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/line-icons.css" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/owl-carousel/owl.pack.css" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/animate.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/flexslider.css" rel="stylesheet" type="text/css" />

    <!-- REVOLUTION SLIDER -->
    <link href="assets/css/revolution-slider.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/layerslider.css" rel="stylesheet" type="text/css" />

    <!-- THEME CSS -->
    <link href="assets/css/essentials.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/layout.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/header-2.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/footer-default.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/color_scheme/red.css" rel="stylesheet" type="text/css" id="color_scheme" />
    <link id="css_dark_skin" href="assets/css/layout-dark.css" rel="stylesheet" type="text/css" title="dark">

    <!-- Morenizr -->
    <script type="text/javascript" src="assets/plugins/modernizr.min.js"></script>

    <!--[if lte IE 8]>
      <script src="assets/plugins/respond.js"></script>
    <![endif]-->
  </head>

  <!--
    Available body classes:
      smoothscroll      = enable chrome browser smooth scroll
      grey          = grey content background
      boxed           = boxed style
      pattern1 ... pattern10  = background pattern

    Background Image - add to body:
      data-background="assets/images/boxed_background/1.jpg"

    Examples:
      <body class="smoothscroll grey boxed pattern3">
      <body class="smoothscroll boxed" data-background="assets/images/boxed_background/1.jpg">
  -->
  <body class="smoothscroll">

    <div id="wrapper">

      <header id="header" class="sticky"> <!-- class="sticky" for sticky menu -->

        <!-- Top Nav -->
        <header id="topNav">
          <div class="container">

            <!-- Logo -->
            <a class="logo" href="index.html">
              <img src="assets/images/my/logo_wht_small.png" alt="" />
            </a>

            <!-- Mobile Menu Button -->
            <button class="btn btn-mobile" data-toggle="collapse" data-target=".nav-main-collapse">
              <i class="fa fa-bars"></i>
            </button>

            <!-- Search -->
            <form class="search" method="get" action="search.html">
              <input type="text" class="form-control" name="s" value="" placeholder="Search">
              <button class="fa fa-search"></button>
            </form>
            <!-- /Search -->

            <!-- Top Nav -->
            <div class="navbar-collapse nav-main-collapse collapse">
              <nav class="nav-main">

                <!--
                  NOTE

                  For a regular link, remove "dropdown" class from LI tag and "dropdown-toggle" class from the href.
                  Direct Link Example:

                  <li>
                    <a href="#">HOME</a>
                  </li>
                -->
                <ul id="topMain" class="nav nav-pills nav-main">
                  <li class="active">
                    <a href="index.html">
                      HOME
                    </a>
                  </li>
                  <li class="">
                    <a class="" href="technology.html">TECHNOLOGY</a>
                  </li>
                  <li class="">
                    <a class="" href="products.html">PRODUCTS</a>
                  </li>
                  <li class="">
                    <a class="" href="contact.html">CONTACT US</a>
                  </li>
                </ul>

              </nav>
            </div>
            <!-- /Top Nav -->

          </div><!-- /.container -->
        </header>
        <!-- /Top Nav -->

      </header>

      <div class="slider roundedcorners">
        <div class="fullscreenbanner">
          <ul class="hide">

            <!-- SLIDE  -->
            <li data-transition="fade" data-slotamount="1" data-masterspeed="1000" data-saveperformance="off">
              <img src="assets/images/my/shine_bg.jpg" alt="" data-bgfit="cover" data-bgposition="right center" data-bgrepeat="no-repeat" />
              <div class="tp-caption very_large_text fade tp-resizeme"
                data-x="60"
                data-y="80"
                data-speed="600"
                data-start="0"
                data-easing="easeOutExpo"
                data-splitin="none"
                data-splitout="none"
                data-elementdelay="0.01"
                data-endelementdelay="0.1"
                data-endspeed="500">
                  <img src="assets/images/my/rx_photon.png" alt=""/>
                  <hr class="half-margins">
              </div>
              <!-- <div class="tp&#45;caption very_large_text fade tp&#45;resizeme" -->
              <!--   data&#45;x="right" -->
              <!--   data&#45;y="0" -->
              <!--   data&#45;speed="600" -->
              <!--   data&#45;start="600" -->
              <!--   data&#45;easing="easeOutExpo" -->
              <!--   data&#45;splitin="none" -->
              <!--   data&#45;splitout="none" -->
              <!--   data&#45;elementdelay="0.01" -->
              <!--   data&#45;endelementdelay="0.1" -->
              <!--   data&#45;endspeed="500"> -->
              <!--     <img src="assets/images/my/shine_bg.jpg" alt=""/> -->
              <!-- </div> -->
              <div class="tp-caption small_light_white fade tp-resizeme"
                data-x="60"
                data-y="220"
                data-speed="600"
                data-start="100"
                data-easing="easeOutExpo"
                data-splitin="none"
                data-splitout="none"
                data-elementdelay="0.01"
                data-endelementdelay="0.1"
                data-endspeed="500">
                  <p class='font600 fsize20' style="font-family:'Arial Rounded MT Bold';">Filter Blue Light By the Power of Nature</p>
                  <hr class="half-margins">
                  <div style="font-family:'Myriad Pro';">
                    <p class="lead" style="background-color: #D70000;"><strong>Legal Exclusive</strong></p>
                  </div>
              </div>
              <div class="tp-caption small_light_white fade tp-resizeme" style="font-family:'Myriad Pro';"
                data-x="60"
                data-y="380"
                data-speed="600"
                data-start="100"
                data-easing="easeOutExpo"
                data-splitin="none"
                data-splitout="none"
                data-elementdelay="0.01"
                data-endelementdelay="0.1"
                data-endspeed="500">
                  <p style="font-family: 'Myriad Pro';"> 100% UVA/UVB Protection with Blue Light (HEV) Filter <span style="color:#D70000;">(PROTECT MORE) </span> </p>
                  <p style="font-family: 'Myriad Pro';">Enhanced Vision <span style="color:#D70000;"> (SEE BETTER-)</span> </p>
                  <p style="font-family: 'Myriad Pro';"> Ultimate Comfort<span style="color:#D70000;"> (REDUCE DIGITAL EYE STRAIN)</span> </p>
              </div>
            </li>
          </ul>
        </div>
      </div>


      <div class="fluid">
          <div class="row">
            <ul class="sort-destination isotope" data-sort-id="isotope-list">
              <li class="sotope-item col-sm-6 col-md-3 design">
                <div class="item-box">
                  <figure>
                    <span class="inner top fsize16">Computer Glasses</span>
                    <a class="item-hover" href="products.html">
                      <span class="overlay color2"></span>
                      <span class="inner">
                        <span class="block fa fa-plus fsize20"></span>
                        Find More
                      </span>
                    </a>
                    <img class="img-responsive" src="assets/images/my/glasses/c1.jpg" alt="">
                  </figure>
                </div>
              </li>
              <li class="sotope-item col-sm-6 col-md-3 design">
                <div class="item-box">
                  <figure>
                    <span class="inner top fsize16">Reading Glasses</span>
                    <a class="item-hover" href="products.html">
                      <span class="overlay color2"></span>
                      <span class="inner">
                        <span class="block fa fa-plus fsize20"></span>
                        Find More
                      </span>
                    </a>
                    <img class="img-responsive" src="assets/images/my/glasses/r1.jpg" alt="">
                  </figure>
                </div>
              </li>
              <li class="sotope-item col-sm-6 col-md-3 design">
                <div class="item-box">
                  <figure>
                    <span class="inner top fsize16">Outdoor</span>
                    <a class="item-hover" href="products.html">
                      <span class="overlay color2"></span>
                      <span class="inner">
                        <span class="block fa fa-plus fsize20"></span>
                        Find More
                      </span>
                    </a>
                    <img class="img-responsive" src="assets/images/my/glasses/o1.jpg" alt="">
                  </figure>
                </div>
              </li>
              <li class="sotope-item col-sm-6 col-md-3 design">
                <div class="item-box">
                  <figure>
                    <span class="inner top fsize16">Fit Oever</span>
                    <a class="item-hover" href="products.html">
                      <span class="overlay color2"></span>
                      <span class="inner">
                        <span class="block fa fa-plus fsize20"></span>
                        Find More
                      </span>
                    </a>
                    <img class="img-responsive" src="assets/images/my/glasses/f1.jpg" alt="">
                  </figure>
                </div>
              </li>
            </ul>
          </div>
        </div>

      <!-- FOOTER -->
      <footer id="footer">
        <hr />

        <div class="copyright">
          <div class="container text-center fsize12">
            All Right Reserved &copy; American Biovision Inc. &nbsp;&bull;
            <a href="contact.html" class="fsize11">Contact us </a>
            <a href="www.facebook.com/">FaceBook</a>
          </div>
        </div>
      </footer>
      <!-- /FOOTER -->

      <a href="#" id="toTop"></a>

    </div><!-- /#wrapper -->

    <!-- JAVASCRIPT FILES -->
    <script type="text/javascript" src="assets/plugins/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="assets/plugins/jquery.isotope.js"></script>
    <script type="text/javascript" src="assets/plugins/masonry.js"></script>

    <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/plugins/magnific-popup/jquery.magnific-popup.min.js"></script>
    <script type="text/javascript" src="assets/plugins/owl-carousel/owl.carousel.min.js"></script>
    <script type="text/javascript" src="assets/plugins/knob/js/jquery.knob.js"></script>
    <script type="text/javascript" src="assets/plugins/flexslider/jquery.flexslider-min.js"></script>

    <!-- REVOLUTION SLIDER -->
    <script type="text/javascript" src="assets/plugins/revolution-slider/js/jquery.themepunch.plugins.min.js"></script>
    <script type="text/javascript" src="assets/plugins/revolution-slider/js/jquery.themepunch.revolution.min.js"></script>
    <script type="text/javascript" src="assets/js/revolution_slider.js"></script>


    <script type="text/javascript" src="assets/js/scripts.js"></script>
    <!-- <script type="text/javascript" src="assets/plugins/styleswitcher/styleswitcher.js">/** REMOVE ON PRODUCTION **/</script> -->
  </body>
</html>

