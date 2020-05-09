<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>main</title>
</head>
<style>
/* ul {
    list-style:none;
    margin:0;
    padding:0;
}

li {
    margin: 0 0 0 0;
    padding: 0 0 0 0;
    border : 0;
    float: left;
} */

.logo h1 {margin: 0 0 0 0; width: 65%; height:65%; background-color:#F5A9BC;float:left;}
.main_nav{width:100%; height:30%;background-color:#ECCEF5; float:left;}
.top_nav{width: 35%; height:65%; padding-margin:auto; background-color:grey; float:right;}
.main_ul {width:80%;height:50%;background-color:#F5A9BC; margin:auto;}
.top_ul {width:80%;height:50%;background-color:#F5A9BC; float:right;}
.header_wrap {background-color:#BDBDBD;width:1200px;height:250px;}

<!--레이어-->

.top_nav li{float:left;padding:0 15px;list-style:none;}
.top_nav a{line-heigt:75px;}

.main_nav li{float:left;margin:0 30px;list-style:none;}

list-style-image {} <!--나중에 ||| 이거 넣을 예정-->

div.word_section {background-color:#BDBDBD; height:300px;}

</style>
<body>
<header>
<div class = "header_wrap">

<div class = "logo">
<h1>
<a href = "javascript:go main()">
<img src = "resources/images/Opal.png" width=150 alt class="default_logo">
</a>
</h1>
</div> 


<div class="top_nav">
<div class="top_ul">
<ul>
<li>로그인</li>
<li>회원가입</li>
<li>고객센터</li>
</ul>
</div>
</div>

<div class="main_nav">
<div class="main_ul">
<ul>
<li>소개</li>
<li>질병DATA</li>
<li>농산물구매</li>
<li>농가별구매</li>
<li>레시피</li>
<li>식단 추천</li>
<li>정기결제</li>
</ul>
</div>
</div>

</div>

</header>

<section>

<div class= word_section>
<h1>
	word_data
</h1>

</div>

</section>

<div>

<h1>
	Hello world!  
</h1>

<br>
<br>
<br>
<P>  The time on the server is ${serverTime}. </P>

</div>

</body>
</html>
