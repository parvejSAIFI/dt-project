<%@ page language="java" contentType="text/html"%>

<%@include file="/WEB-INF/views/Header.jsp" %>
<HTML>

<BODY>
<div class="container">
  <h2>HOME PAGE</h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="<c:url value='resources/images/Big bazaar.jpg' />" alt="Los Angeles" style="width:100%;">
      </div>

<div class="item">
        <img src="<c:url value='resources/images/wc-banner.jpg' />" alt="Chicago" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="<c:url value='resources/images/winter ware.jpg' />" alt="Chicago" style="width:100%;">
      </div>
    
     <div class="item">
        <img src="<c:url value='resources/images/mobile.jpg' />" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="<c:url value='resources/images/shoes.png' />" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</BODY>
</HTML>
