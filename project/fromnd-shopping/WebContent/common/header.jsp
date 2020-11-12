<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String useridChk = (String)session.getAttribute("userid");
	System.out.println("header 아이디 : " + useridChk); 
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
		
		$(function(){ //로그인 버튼 눌렀을 때 로그인 창 뜨게 함
		    $("#login_btn").click(function(){
		        $(".lg").show();
		    });
		});
		
		$(function(){ //로그인 창에서 x버튼 눌렀을때 창이 꺼짐
		    $(".close_btn").click(function(){
		        $(".lg").hide();
		    });
		});
		
		//로그인 체크여부
		function loginChk(frm) {
			frm.action="controller?type=loginChk";
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
					        <li><button id="login_btn" type="submit">로그인</button></li>
					        <li><button id="signup_btn" type="submit" onclick='javascript:location.href="02.signup.jsp"'>회원가입</button></li>
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
		
	<!-- 로그인 창-->
		<form method="POST" action="loginController?type=login" >
		    <div class= "lg">
		        <img class="close_btn" src="images/close.jpg">
		        <h2>로그인</h2>
		        <input type="text" class="lg-control" name="id" placeholder="아이디" autocomplete="off" required>
		        <input type="password" class="lg-control" name="password" placeholder="비밀번호"><br>
		
		        <input type= "checkbox" id="checkbox"><p style="text-align: left; margin-left:110px;">아이디 저장</p><br>
		        <input type="submit" class="lgf-control" value="로그인" onclick="loginChk(this.form)"> 
		        
		        <U style="text-align: left; margin-left:-180px; font-size: 0.9em;">아이디/비밀번호 찾기</U>
		        <input type="button" class= "lgs-control" value="회원가입" onclick='javascript:location.href="02.signup.jsp"'>
		        <p style="text-align: left; margin-top:50px; margin-left:80px; font-size: 0.8em; color: gray;"> 
		        	아직 프롬앤디의 회원이 아니세요? <br>
					프롬앤디의 회원이 되시면 회원에게만 제공하는 <br>
					다양한 혜택을 누리실 수 있습니다!
				</p><br><br><br><br><br>
		    </div>
		</form>
</header>