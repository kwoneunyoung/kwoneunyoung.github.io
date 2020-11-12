<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% System.out.println("로그인헤더"); %>
<%
	String useridChk = (String)session.getAttribute("userid");
	System.out.println("headerLogin 로그인 아이디 : " + useridChk); 
%>
<header>
<script src="//code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
$(document).ready(function(){
	var jbOffset = $('.menu1').offset();
	$(window).scroll(function(){
		if($(document).scrollTop()>jbOffset.top ){
			$('.menu1').addClass('jbFixed');
		}
		else {
			$('.menu1').removeClass('jbFixed');
		}
	});
});

	function logout() {
		location.href="00.logoutAction.jsp";
	}
	function viewSeller(frm) {
		frm.action="controller?type=viewSeller";
		frm.submit();
	}
</script>
 <div id="header" class="aft">
		<div class="hgroup">
		        <h1><img src="images/logo.png" onclick="javascript:location.href='01.main.jsp'"></h1>
		        <form name="myForm" action="controller" method="POST">
				<input type="hidden" name="type" value="viewCartlist" />
				<input type="hidden" name="userid" value="${userid }" />
				</form>
		    <br><br><br>
		        <!--회원가입, 로그인, 마이페이지 전체-->
			    <div class="user">
				    <ul>
					  	<li>
					     	<div id="btn_group">
						        <li><button id="login_btn" type="submit" onclick="logout()">로그아웃</button></li>
						        <li><input type="button" value="마이페이지" onclick=""></li>
						       	<li class="sellerRegister">
			               			 <form method="post">
					                   <input type="button" value="상점정보"
					                         onclick="viewSeller(this.form)">
					                   <input type="hidden" name="userid" value="<%=useridChk %>">
			                		</form>
	            				</li>
					       </div>
						</li>
						
					</ul>
			    </div>
			   <div class="util">
			   		<img class="cart" src="images/cart.png" style="cursor: pointer;" onclick="javascript:document.myForm.submit();">
			   </div>
			    <!--카테고리 상단바-->
			    <nav class="banner">
			        <div class="menu1">
				        <ul class="cate">
				            <li><a href="#">Best 10</a></li> 
				            <li><a href="#">신상 5%</a></li>
				            <li><a href="#">당일발송</a></li>
				            <li><a href="#">브랜드</a></li>
				            <li><a href="#">아우터</a></li> 
				            <li><a href="#">상의</a></li> 
				            <li><a href="#">블라우스</a></li> 
				            <li><a href="#">원피스</a></li> 
				            <li><a href="#">하의</a></li> 
				            <li><a href="#">신발&가방</a></li> 
				            <li><a href="#">악세사리</a></li> 
				            <li><a href="#">세일</a></li> 
				            <li><a href="#">여름특가세일</a></li> 
				            <li><a href="#">커뮤니티</a></li>
				        </ul>
			        </div>
			    </nav>
			</div>
		</div>
</header>

