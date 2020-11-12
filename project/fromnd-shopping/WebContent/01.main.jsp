<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String userid = (String)session.getAttribute("userid");
	System.out.println("메인페이지 현재 아이디 : " + userid);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/seller.css">
</head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript">	
	function go_productlist(frm) {
		frm.action="controller";
		frm.submit();
	}
	
$(document).ready(function(){
	//저장된 쿠키값을 가져와서 id값을 넣어준다
	var userInputId=getCookie("userInputId");
	$("Input[name='id']").val(userInputId);
	
	if($("input[name='id']").val()!="") { //그 전에 id를 저장해서 처음 페이지 로딩 시 입력 칸에 저장 된 id가 표시된 상태라면
		$("#checkbox").attr("checked", true); //id저장하기를 체크 상태로 두기
	}
	$("#checkbox").change(function(){ //체크박스에 변화가 있다면
		if($("#checkbox").is(":checked")){ //id저장하기를 체크 했을 때
			var userInputId = $("input[name='id']").val();
			setCookie("userInputId", userInputId, 7); //7일동안 쿠키 보관
		} else { //id 저장하기 체크 해제 시
			deleteCookie("userInputId");
		}	
	});
	//id저장하기를 체크한 상태에서 id를 입력하는 경우 이럴 때도 쿠키 저장
	$("input[name='id']").keyup(function(){ //id 입력 칸에 id를 입력 할 때
		if($("#checkbox").is(":checked")){ //id 저장하기를 체크한 상태라면
			var userInputId=$("input[name='id']").val();
			setCookie("userInputId",userInputId,7); //7일동안 보관
		}
	});
});
	function setCookie(cookieName, value, exdays){
	    var exdate = new Date();
	    exdate.setDate(exdate.getDate() + exdays);
	    var cookieValue = escape(value) + ((exdays==null) ? "" : "; expires=" + exdate.toGMTString());
	    document.cookie = cookieName + "=" + cookieValue;
	}
	 
	function deleteCookie(cookieName){
	    var expireDate = new Date();
	    expireDate.setDate(expireDate.getDate() - 1);
	    document.cookie = cookieName + "= " + "; expires=" + expireDate.toGMTString();
	}
	 
	function getCookie(cookieName) {
	    cookieName = cookieName + '=';
	    var cookieData = document.cookie;
	    var start = cookieData.indexOf(cookieName);
	    var cookieValue = '';
	    if(start != -1){
	        start += cookieName.length;
	        var end = cookieData.indexOf(';', start);
	        if(end == -1)end = cookieData.length;
	        cookieValue = cookieData.substring(start, end);
	    }
	    return unescape(cookieValue);
	}
	
</script>
<body>
<% if(session.getAttribute("userid") == null) { %>
	<%@ include file="common/header.jsp" %> 
<%
	} else { %>
	<%@ include file="common/headerLogin.jsp" %>	
<%
	}
%>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="card">
						<img src="images/model1.jpg" class="card-img-top">
							<div class="card-body">
								<h5 class="card-title">크림치즈마켓</h5>
								<p class="card-text">#10대#20대#심플베이직#러블리</p>
								<a href="#" class="btnall">방문하기</a>
							</div>
					</div>
				</div>
			<div class="col-md-4">
				<div class="card">
					<img src="images/model2.jpg" class="card-img-top">
					<div class="card-body">
						<h5 class="card-title">쇼퍼랜드</h5>
						<p class="card-text">#10대#20대#심플베이직#캠퍼스룩</p>
						<a href="#" class="btnall">방문하기</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<img src="images/model3.jpg" class="card-img-top">
					<div class="card-body">
						<h5 class="card-title">런앱썸</h5>
						<p class="card-text">#20대#러블리#캐주얼</p>
						<a href="#" class="btnall">방문하기</a>
					</div>
				</div>
			</div>
		</div>
	</div>	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<img src="images/model4.jpg" class="card-img-top">
					<div class="card-body">
						<h5 class="card-title">기프티박스</h5>
						<p class="card-text">#10대#20대#페미닌#심플베이직</p>
						<a href="#" class="btnall">방문하기</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<img src="images/model5.jpg" class="card-img-top">
					<div class="card-body">
						<h5 class="card-title">베이델리</h5>
						<p class="card-text">#10대#20대#페미닌#심플베이직</p>
						<a href="#" class="btnall">방문하기</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<img src="images/model6.jpg" class="card-img-top">
					<div class="card-body">
						<h5 class="card-title">무아무아</h5>
						<p class="card-text">#10대#20대#심플베이직#러블리</p>
						<a href="#" class="btnall">방문하기</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<h1 class="sub1">Today Salay</h1>
	<div class="container">
	<div class="row">
		<div class="col-md-4">
			<div class="card">
			<form method="post">
				<img src="images/image5.jpg" class="card-img-top" style="height:384px">
				<div class="card-body">
					<h5 class="card-title">반팔</h5>
					<input class="btnall" style="background-color : orange hidden"
						type="button" value="방문하기" onclick="go_productlist(this.form)">
					<input type="hidden" name="p_idx" value="1">
					<input type="hidden" name="type" value="productlist">
					<input type="hidden" name="userid" value="${userid }">
				</div>
			</form>
			</div>
		</div>
		<div class="col-md-4">
			<div class="card">
			<form method="post">
				<img src="images/image6.jpg" class="card-img-top" style="height:384px">
				<div class="card-body">
					<h5 class="card-title">슬랙스</h5>
					<input class="btnall" style="background-color : orange hidden"
						type="button" value="방문하기" onclick="go_productlist(this.form)">
					<input type="hidden" name="p_idx" value="2">
					<input type="hidden" name="type" value="productlist">
					<input type="hidden" name="userid" value="${userid }">
				</div>
			</form>
			</div>
		</div>
		<div class="col-md-4">
			<div class="card">
			<form method="post">
				<img src="images/image8.jpg" class="card-img-top" style="height:384px">
				<div class="card-body">
					<h5 class="card-title">반지</h5>
					<input class="btnall" style="background-color : orange hidden"
						type="button" value="방문하기" onclick="go_productlist(this.form)">
					<input type="hidden" name="p_idx" value="3">
					<input type="hidden" name="type" value="productlist">
					<input type="hidden" name="userid" value="${userid }">
				</div>
			</form>
			</div>
		</div>
		</div>
	</div>
	<h1 class="sub2">Best Item</h1>
	<div class="container">
	<div class="row">
		<div class="col-md-4">
			<div class="card">
			<form method="post">
				<img src="images/m1.jpg" class="card-img-top" style="height:384px">
				<div class="card-body">
					<h5 class="card-title">니트라인</h5>
					<input class="btnall"
						type="button" value="방문하기" onclick="go_productlist(this.form)">
					<input type="hidden" name="p_idx" value="3">
					<input type="hidden" name="type" value="productlist">
					<input type="hidden" name="userid" value="${userid }">
				</div>
			</form>
			</div>
		</div>
	</div>
	</div>
	
	<%@ include file="common/footer.jsp" %>
</body>
</html>